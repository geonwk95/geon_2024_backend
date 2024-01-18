package 과제.과제7;



import day13.Step4.package2.D;

import java.util.Scanner;

public class View {
   // 싱글톤
    private View(){}
    private static View view = new View();
    public static View getInstance(){return view;}

    // 필드
    Scanner scanner = new Scanner(System.in);

    // 메소드
    public void run(){
        while(true) {

            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = scanner.nextInt();

            if( ch == 1 ) {
                // 1. 입력받기
                System.out.println("회원가입 ~");
                System.out.print("아이디 : "); String id = scanner.next();
                System.out.print("비밀번호 : "); String pw = scanner.next();
                System.out.print("이름 : "); String name = scanner.next();
                System.out.print("전화번호 : "); String phone = scanner.next();
                System.out.print("나이 : "); String age = scanner.next();
                Dto dto = new Dto(id,pw,name,phone,age);

                boolean result = Controller.회원가입(dto);
                System.out.println("[5] result = " + result);
                if (result){
                    System.out.println("회원가입 성공");
                }else {
                    System.out.println("회원가입 실패");
                }


            }
            else if( ch == 2 ) {
                // 1. 입력받기
                System.out.print("아이디 : "); String id = scanner.next();
                System.out.print("비밀번호 : "); String pw = scanner.next();

                Dto dto = new Dto();
                dto.setId(id);
                dto.setPw(pw);

                boolean result = Controller.로그인(dto);
                System.out.println("[5] result = " + result);
                if (result){
                    System.out.println("로그인 성공");
                }else {
                    System.out.println("로그인 실패");
                }

            }
            else if( ch == 3 ) {
                // 1.입력받기
                System.out.print("이름 : "); String name = scanner.next();
                System.out.print("전화번호 : "); String phone = scanner.next();

                Dto dto = new Dto();
                dto.setName(name);
                dto.setPhone(phone);

                boolean result = Controller.아이디찾기(dto);
                System.out.println("[5] result = " + result);

            }
            else if( ch == 4 ) {
                System.out.print("아이디 : "); String id = scanner.next();
                System.out.print("전화번호 : "); String phone = scanner.next();

                Dto dto = new Dto();
                dto.setId(id);
                dto.setPhone(phone);

                boolean result = Controller.비밀번호찾기(dto);
                System.out.println("[5] result = " + result);
            }

        } // w e
    } // 메소드 e
} // c e
