package bank;

import java.util.Scanner;

// 정적 배열 ver

public class BankEx {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Account[] acList = new Account[100];

        int i = 0;
        int end = 0;


        while (true){

            if (end == 1) break;

            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 > ");

            int op = Integer.parseInt(scanner.nextLine());
            switch (op){
                case 1:
                    System.out.println("---------");
                    System.out.println(" 계좌생성 ");
                    System.out.println("---------");


                    System.out.print("계좌번호: ");
                    String aNum = scanner.nextLine();

                    System.out.print("계좌주: ");
                    String aName = scanner.nextLine();

                    System.out.print("초기입금액: ");
                    int aMon = Integer.parseInt(scanner.nextLine());

                    acList[i] = new Account(aName, aNum, aMon);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    i++;
                    break;
                case 2:
                    System.out.println("---------");
                    System.out.println(" 계좌목록 ");
                    System.out.println("---------");

                    for (int j = 0; j < acList.length; j++){
                        if (acList[j] != null) {
                            System.out.println(acList[j].id + "  " + acList[j].name + "  " + acList[j].money);
                        }
                    }
                    break;
                case 3:
                    System.out.println("---------");
                    System.out.println(" 예금 ");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    aNum = scanner.nextLine();
                    System.out.print("예금액: ");
                    int dep = Integer.parseInt(scanner.nextLine());
                    for (int j=0; j < acList.length;j++){
                        if (acList[j] != null) {
                            if (acList[j].id.equals(aNum))
                                acList[j].money += dep;
                        }
                    }
                    break;
                case 4:
                    System.out.println("---------");
                    System.out.println(" 출금 ");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    aNum = scanner.nextLine();
                    System.out.print("출금액: ");
                    int with = Integer.parseInt(scanner.nextLine());

                    for (int j=0; j < acList.length;j++){
                        if (acList[j] != null) {
                            if (acList[j].id.equals(aNum))
                                acList[j].money -= with;
                        }
                    }
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    end = 1;
                    break;
            }
        }

    }
}
