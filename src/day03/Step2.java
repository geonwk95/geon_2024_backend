package day03; // 패키지 명

import java.util.Scanner;

public class Step2 { // class s

    public static void main(String[] args) {
        // 객체 사용이유 : 미리 설계(Scanner 입력관련)된 메소드를 사용할려고
        Scanner scanner = new Scanner(System.in);

        // 예제1 : 작성자 , 내용 , 날짜 3가지를 문자로 입력받아 출력.
            // 1. 입력 , 변수
            System.out.print("작성자 : ");
            String 작성자 = scanner.nextLine();

            System.out.print("내용 : ");
            String 내용 = scanner.nextLine();

            System.out.print("날짜 : ");
            String 날짜 = scanner.nextLine();

            // 2. 입력받은 데이터 출력
            System.out.printf("==========방문록===========\n");
            System.out.printf("%4s %10s %4s %10s\n" ,"번호" ,"작성자" ,"내용" ,"날짜");
            System.out.printf("%4s %10s %4s %10s\n" ,1 ,작성자 ,내용 ,날짜);


        // 예제2 : 기본급 과 수당을 정수로 입력받아 실수령액 계산해서 출력
            // 실수령액 : 기본급 + 수당 - 세금[기본급10%]

            // 1. 입력
            /*System.out.print("기본급 : ");
            int 기본급 = scanner.nextInt();

            System.out.print("수당 : ");
            int 수당 = scanner.nextInt();

            // 2. 처리
            int 실수령액 = (int)(기본급 + 수당 - (기본급*0.1));
                // int = int + int - int * double => double
                // 0.1 double형 이므로 int*double 의 결과는 double
                // 그래서 double을 int에 대입할수 없다 -> 강제 타입변환해야함
            // 3. 출력
            System.out.println("실수령액 : " + 실수령액);*/

    } // main e

} // class e
