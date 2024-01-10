package day07;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Phone[] phoneBook = new Phone[100]; // 배열
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("============= 전화번호부 =============");
            System.out.printf("%2s %5s %11s\n", "순번", "이름", "전화번호");

            for (int i = 0 ; i < phoneBook.length; i++) {
                if (phoneBook[i] != null) {
                    System.out.printf("%2d %7s\t %15s\n", i+1, phoneBook[i].이름, phoneBook[i].전화번호);

                }
            } // f e

                System.out.println("1.전화번호등록 2.전화번호삭제");
                System.out.print("선택 > ");   int 등록 = scanner.nextInt();

                if (등록 == 1) {
                    Phone phone = new Phone();
                    System.out.print("이름 : "); phone.이름 = scanner.next();
                    System.out.print("전화번호 : "); phone.전화번호 = scanner.next();
                    for (int i = 0; i < phoneBook.length; i++) {
                        if(phoneBook[i]==null){
                            phoneBook[i]=phone; break;
                        }

                    }


                   /* phone.이름 = 이름;
                    phone.전화번호 = 전화번호;
                    phone.이름 = 이름 phone.전화번호 = 전화번호;
                    phoneBook[0] = phone;
                    phoneBook[0].이름 = phone.이름 = 이름
                    phoneBook[0].전화번호 = phone.전화번호 = wjsg*/
                }else if (등록 == 2){
                    System.out.print("삭제할 번호 > "); int 순번 = 0;
                    순번 = scanner.nextInt();
                    for ( int i = 0 ; i < phoneBook.length ; i++){

                    }
                }




        }// 무한반복 종료
        
    } // m e
} // c e
