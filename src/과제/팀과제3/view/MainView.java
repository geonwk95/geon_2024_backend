package 과제.팀과제3.view;

import 과제.팀과제3.view.View;

import java.util.Scanner;

public class MainView {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("========== 업무 선택 ==========");
            System.out.println("1. 계좌생성 | 2. 예금 | 3. 출금 ");
            System.out.print("선택:");
            int ch = scanner.nextInt();
            View view = new View();

            if( ch == 1 ){  // 1. 계좌생성
                view.계좌생성();
            }
            else if( ch == 2 ){ // 2. 예금
                view.예금();
            }
            /*else if(ch == 3) {// 3.출금
                view.출금();
            }*/

        }
    }
}
