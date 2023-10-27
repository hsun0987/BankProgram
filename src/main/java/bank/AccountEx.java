package bank;

import java.util.Scanner;
import java.util.ArrayList;

public class AccountEx {
    static ArrayList<Account> accounts = new ArrayList();
    public static void main(String[] args) {
        // 사용자로부터 입력
        Scanner scanner = new Scanner(System.in);

        int end = 0; // while문 끝

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
                    String aId = scanner.nextLine();

                    System.out.print("계좌주: ");
                    String aName = scanner.nextLine();

                    System.out.print("초기입금액: ");
                    int aMon = Integer.parseInt(scanner.nextLine());

                    accounts.add(new Account(aName, aId, aMon));
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;

                case 2:
                    System.out.println("---------");
                    System.out.println(" 계좌목록 ");
                    System.out.println("---------");

                    for (Account account : accounts){
                        System.out.println(account.id + " " + account.name + " " + account.money);

                    }
                    break;
                case 3:
                    System.out.println("---------");
                    System.out.println(" 예금 ");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    aId = scanner.nextLine();
                    System.out.print("예금액: ");
                    int dep = Integer.parseInt(scanner.nextLine());
                    for (Account account : accounts){
                        if (account.id.equals(aId))
                            account.money += dep;

                    }
                    break;
                case 4:
                    System.out.println("---------");
                    System.out.println(" 출금 ");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    aId = scanner.nextLine();
                    System.out.print("출금액: ");
                    int with = Integer.parseInt(scanner.nextLine());

                    for (Account account : accounts){
                        if (account.id.equals(aId))
                            account.money -= with;
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