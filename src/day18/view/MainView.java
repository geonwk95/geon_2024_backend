package day18.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {

    // 싱글톤
    private MainView(){}
    private static MainView mainView = new MainView();
    public static MainView getInstance(){
        return mainView;
    }
    Scanner scanner = new Scanner(System.in);

    public  void run(){
        while (true){
            System.out.println("========= 메인페이지 ==========");
            System.out.println("1.회원가입 2.로그인 3.아이디찾기");
            try { // 만약에 try{} 안에서 예외가 발생하면 catch 이동
                int ch = scanner.nextInt();

                if (ch==1){
                    MemberView.getInstance().signup();
                }
                else if (ch==2) {
                    MemberView.getInstance().login();

                }else {
                    System.out.println("[안내] 알수 없는 기능 번호 입니다.");
                }

                // catch 다중이 가능하다.
            }catch (InputMismatchException e){ // input 타입 오류
                System.out.println("[안내] 숫자만 입력해주세요"+e);

                scanner = new Scanner(System.in); // 입력객체내 입력받은 필드/바이트 초기화

            }catch (Exception e){ // 그외 : 테스트 하면서 오류 확인후 추후에 업데이트할 예정
                System.out.println(e);
            }


        } // w e
    } // r e
} // c e
