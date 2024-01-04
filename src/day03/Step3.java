package day03; // 패키지 명

import java.util.Scanner;

/*
문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.

문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.

문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.

문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.

문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.

문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
계산식) 표준체중 계산식 = > (키 - 100) * 0.9

문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
        계산식) 1 inch -> 2.54cm

문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
int x = 10;
int y = x-- + 5 + --x;
printf(" x의 값 : %d , y의값 :  %d ", x, y)

문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력

문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
*/
public class Step3 { // class s

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        /*System.out.print("숫자를 입력해주세요 : ");
        int a = scanner.nextInt();
        System.out.println((a % 7)==0 ? "O" : "X");*/

        // 2.
        /*System.out.print("숫자를 입력해주세요 : ");
        int b = scanner.nextInt();
        System.out.println(b % 2 == 0 ? "짝수" : "홀수");*/

        // 3.
        /*System.out.print("숫자를 입력해주세요 : ");
        int c = scanner.nextInt();
        System.out.println(c % 7 == 0 && c % 2 != 0 ? "X" : "O");*/

        // 4.
        /*System.out.println("숫자를 입력해주세요 : ");
        int d = scanner.nextInt();
        System.out.println(d % 11 == 0 || d % 2 == 0 ? "O" : "X");*/

        // 5.
        /*System.out.println("숫자1를 입력해주세요 : ");
        int e = scanner.nextInt();
        System.out.println("숫자2를 입력해주세요 : ");
        int f = scanner.nextInt();
        System.out.println(e > f ? e : f );*/

        // 6.
        /*System.out.println("반지름을 입력해주세요 : ");
        int g = scanner.nextInt();
        double 원넓이 = g*g*3.14;
        System.out.printf("원넓이 : %.2f", 원넓이);*/

        // 7.
        /*System.out.println("실수1을 입력해주세요 : ");
        double h = scanner.nextDouble();
        System.out.println("실수2을 입력해주세요 : ");
        double i = scanner.nextDouble();

        double 백분율 = (h/i)*100;
        System.out.printf("출력 : %.1f %%", 백분율);*/

        // 8.
        /*System.out.println("윗변 : ");
        double j = scanner.nextDouble();
        System.out.println("밑변 : ");
        double k = scanner.nextDouble();
        System.out.println("높이 : ");
        double l = scanner.nextDouble();

        double 넓이 = (j + k)*l/2;
        System.out.printf("넓이 : %.1f" , 넓이);*/

        // 9.
        /*System.out.print("키 : ");
        int 키 = scanner.nextInt();
        int 표준체중 = (int)((키-100)*0.9);
        System.out.print("표준체중 : " + 표준체중);*/

        // 10.
        /*System.out.print("키 : ");
        double 키 = scanner.nextDouble();
        System.out.print("몸무게 : ");
        double 몸무게 = scanner.nextDouble();

        double BMI = 몸무게/((키/100)*(키/100));
        System.out.printf("BMI : %.2f" , BMI);*/

        // 11.
        /*System.out.print("inch : ");
        double inch = scanner.nextDouble();
        double cm = inch*2.54;
        System.out.printf("cm : %.2f",cm);*/

        // 12.
        /*System.out.print("중간고사 : ");
        double 중간고사 = scanner.nextDouble();
        System.out.print("기말고사 : ");
        double 기말고사 = scanner.nextDouble();
        System.out.print("수행평가 : ");
        double 수행평가 = scanner.nextDouble();
        System.out.printf("중간고사 : %.2f 기말고사 : %.2f 수행평가 : %.2f" , 중간고사*0.3,기말고사*0.3,수행평가*0.4);
*/

        // 13.
        /*int x = 10;
        int y = x-- + 5 + --x;
        // 1. x-- + 5 -> 10 + 5 = 15 [ 더한후에 차감 ]
        // 2. 15 + --x ->  15 + 8 = 23 [ 더하기전에 차감 ]
        System.out.printf(" x의 값 : %d , y의 값 : %d " , x , y); // 23*/

        // 14.
       /* System.out.print("나이 : ");
        int 나이 = scanner.nextInt();
        System.out.println(나이 >= 40 ? "중년" : 나이 >= 20 ? "성인" : 나이 >= 10 ? "학생" : "애기");*/

        // 15.

        // 16.
        /*System.out.print("아이디 : ");
        String 아이디 = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String 비밀번호 = scanner.nextLine();

        System.out.println("로그인 정보 = " + (아이디.equals("admin") && 비밀번호.equals("1234") ? "로그인성공" : "로그인실패"));*/

        // 17.
        /*System.out.println("숫자1를 입력해주세요 : ");
        int x = scanner.nextInt();
        System.out.println("숫자2를 입력해주세요 : ");
        int y = scanner.nextInt();
        System.out.println("숫자3를 입력해주세요 : ");
        int z = scanner.nextInt();
        System.out.println( x >= y && x >= z ? x : y >= x && y >= z ? y : z);*/



    }





} // class e
