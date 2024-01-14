package 과제.팀과제2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        MemberInfo[] user = new  MemberInfo[3];
        Scanner scanner = new Scanner(System.in);

        while ( true ){




            System.out.println("=====구독 및 판매시스템======================================");
            System.out.println("1.회원가입                          2.로그인");
            System.out.println("===========================================================");

            for (int i = 0; i < user.length; i++) {
                if ( user[i] != null){
                    System.out.printf("%2d %4s %10s %10s %15s %8s" , user[i].no , user[i].name , user[i].id , user[i].pw , user[i].num , user[i].birth+"\n");
                }

            }
            int ch = scanner.nextInt();
            if (ch==1){
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
                MemberInfo newMemberInfo = new MemberInfo(no,name,id,pw,num,birth);
                // 3. MemberInfo배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for (int i = 0; i < user.length; i++) {
                    if (user[i] == null){
                        user[i] = newMemberInfo;
                        break;
                    }
                }
            }if (ch==2){
                // 1.입력받기
                System.out.println("아이디 비밀번호를 입력하세요");
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();

                for (int i = 0 ; i < user.length; i++){

                    if(user[i] == null){
                        System.out.println("회원가입부터 해주세요");
                        break;
                    }if (user[i].id == id && user[i].pw == pw){
                        System.out.println("로그인성공");
                    }else {
                        System.out.println("로그인실패");
                    }
                }

            }
        }

    } // m e
} // c e
