package 과제.팀과제1계산기; // 패키지 명

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class Step1 { // class s

    public static void main(String[] args) { // main s
        Scanner scanner = new Scanner(System.in);
    String 피연산자1 = "";
    String 피연산자2 = "";
    String 연산자 = "";
    boolean 나가기 = true;
        while ( 나가기 ) { // w s

            System.out.print("숫자를 입력해주세요 : ");
            String 입력1 = scanner.nextLine();
            System.out.print("연산자를 입력해주세요 : ");
            String 입력2 = scanner.nextLine();
            System.out.print("숫자를 입력해주세요 : ");
            String 입력3 = scanner.nextLine();

            double 숫자피연산자1 = Double.parseDouble(입력1);
            /*System.out.println(숫자피연산자1);*/
            double 숫자피연산자3 = Double.parseDouble(입력3);
            /*System.out.println(숫자피연산자3);*/
            char 차 =' ';
            for (int i = 0 ; i >= 입력1.length() ; i++) {
                차 = 입력1.charAt(i);

                if (48 <= 차 && 차 <= 57){}
                else {
                    System.out.println("숫자입력해라");
                    break;
                }

            }


            if (입력2.equals("+")){ // if s
                System.out.printf("값 : %f",(숫자피연산자1+숫자피연산자3),"\n");
            } else if (입력2.equals("-")) {
                System.out.printf("값 : %f",(숫자피연산자1-숫자피연산자3),"\n");
            } else if (입력2.equals("*")){
                System.out.printf("값 : %f",(숫자피연산자1*숫자피연산자3),"\n");
            } else if (입력2.equals("/")) {
                System.out.printf("값 : %f",(숫자피연산자1/숫자피연산자3),"\n");
            }



            // if e






        } // w e
    } // main e

} // class e
