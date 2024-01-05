package day04;

import java.util.Scanner;

public class Step3 {// class start

    public static void main(String[] args) { // main tart

        // 입력객체 생성 : import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [ on / off ]
        int speed = 0; // 현재 속도를 저장하고 있는 변수 [ 1입력하면 1증가 , 2입력하면 1감소 ]

        while ( run ){ // 무한루프 시작

            // ================= 무한 반복 출력 ================= //
            System.out.println("-----------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
            System.out.println("-----------------------");
            System.out.println("선택 : ");
            // ================= ================= ================= //
            // =================== 무한 반복 입력 ==================== //
            String strNum = scanner.nextLine(); // 엔터를 입력할때까지 'console이 대기' 상태로 됨.
            // ================= ================= ================= //

            // ================== 입력값에 따른 경우의수 판단 ======================= //
            if( strNum.equals("1")){ // 만약에 입력받은 값(문자열) 문자 1이면 [ 문자 비교시에는 equals() ]
                speed++; // 변수 값 연산
                System.out.println("현재속도 : " + speed);
            } else if ( strNum.equals("2")) { // 만약에 입력받은 값이 문자2 이면
                speed--; // 변수 값 연산
                System.out.println("현재속도 : " + speed);
            } else if ( strNum.equals("3")) { // 만약에 입력받은 값이 문자3 이면
                // 1.
                run = false;
                // 2.
                break; // 가장 가까운 반복문 탈출 키워드;
                // 3.
                // return; // 현재 함수 종료.
            } // if e

        }// 무한루프 끝
        System.out.println("프로그램 종료");

    }// main end

}// class end
/*
    무한루프 = 무한반복
        1.
            while( true ){ }
        2.
            boolean run = true;
            while (run){  }
*/