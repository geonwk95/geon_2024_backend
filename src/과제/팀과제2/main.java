package 과제.팀과제2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        MemberInfo[] user = new  MemberInfo[100];
        Survice 구독 = new  Survice();
        Survice2 구독2 = new Survice2();
        Survice3 구독3 = new Survice3();

        Scanner scanner = new Scanner(System.in);
        while ( true ) {


            System.out.println("===================구독 및 판매시스템=========================");
            System.out.println("1.회원가입                  2.로그인                          ");
            System.out.println("===========================================================");


            int ch = scanner.nextInt();
            if (ch == 1) { // 1.회원가입
                // 1.입력받기
                System.out.print("회원번호 : ");
                int no = scanner.nextInt();
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();
                System.out.print("전화번호 : ");
                String num = scanner.next();
                System.out.print("생년월일 : ");
                String birth = scanner.next();
                // 2.객체생성
                MemberInfo newMemberInfo = new MemberInfo(no, name, id, pw, num, birth);
                // 3. MemberInfo배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for (int i = 0; i < user.length; i++) {
                    if (user[i] == null) {
                        user[i] = newMemberInfo;

                        break;
                    }
                }System.out.println("회원가입 성공");
            } // if1 e
            if (ch == 2) { // 2.로그인
                // 1.입력받기
                System.out.println("아이디 비밀번호를 입력하세요");
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();

                for (int i = 0; i < user.length; i++) {
                    if (user[i] != null) {
                        if (user[i].id.equals(id) && user[i].pw.equals(pw)) {
                            System.out.println("로그인성공");
                            break;
                        }

                    } else {
                        System.out.println("없는아이디입니다.");
                        break;
                    }

                }
            } // if2 e

        } // w e

    } // m e
} // c e
