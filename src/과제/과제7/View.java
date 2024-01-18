package 과제.과제7;

import 과제.과제6.Member;

import java.util.Scanner;

public class View {
    static Member[] members = new Member[100];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {





        while(true) {

            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = sc.nextInt();

            if( ch == 1 ) {
                회원가입();
            }
            else if( ch == 2 ) {
                로그인();
            }
            else if( ch == 3 ) {
                아이디찾기();
            }
            else if( ch == 4 ) {
                비밀번호찾기();
            }

        } // w e
    } // m e
}
