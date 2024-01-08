package day05;

import java.util.Scanner;

public class Step4 { // class s
    // p.199 확인문제 9번
    public static void main(String[] args) { // main s

        // *입력객체
        Scanner scanner = new Scanner(System.in);
        // 5. int형 데이터를 여러개 저장할수 있는 배열 선언.
        int[] 학생수 = new int[0];

        // 1. 무한루프
        while (true) { // w s
            // 2. 출력
            System.out.println("-----------------------------------------");
            System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료|");
            System.out.println("-----------------------------------------");
            // 3. 입력
            System.out.print("선택> ");
            String 선택 = scanner.nextLine();
            // 4. 경우의수
            if (선택.equals("1")) {
                System.out.println("학생수>  ");
                String count = scanner.nextLine();
                학생수 = new int[Integer.parseInt(count)]; // 기존 데이터는 사라짐.
            } else if (선택.equals("2")) {
                // 6. [1]번에서 입력받은 학생수 만큼 점수를 입력받기
                for (int i = 0; i < 학생수.length ; i++) {
                    System.out.printf("점수[%d]> ", i+1);
                    // 입력받은 문자열 -> 정수 변환 해서 i번째 인덱스에 저장.
                    학생수[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if (선택.equals("3")) {
                // 7. 배열내 모든 학생 점수 출력
                for (int i = 0; i < 학생수.length; i++) {
                    System.out.printf("점수[%d]> %d \n", i+1, 학생수[i]);
                }
            } else if (선택.equals("4")) {
                // 8. 최고 점수 , 평균 출력

                int max = 0; // 임의 최저 점수 대입하고 시작
                int sum = 0; // 총합계
                for (int i = 0; i < 학생수.length; i++) {
                    // 만약에 i번째 인덱스의 값이 max보다 크면 대입.
                    if (학생수[i] >= max) {
                        max = 학생수[i];
                        // 평균에서 사용할 총합계
                        sum += 학생수[i];
                    }
                }
                    System.out.println("최고점수 = " + max);

                    // 총합계 / 학생수( 배열의길이 )
                    double avg = sum/학생수.length;
                    System.out.printf("평균 = %.1f \n", avg);


                } else if (선택.equals("5")) {
                System.out.println("프로그램 종료"); break;
            }


        } // w e
    } // main e

} // class e
