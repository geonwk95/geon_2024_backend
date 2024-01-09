package day06;

import java.util.Scanner;

public class Step5 { // c s
    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in);
        System.out.print(" 시간(hhmmss형식) : ");
        String time = scanner.nextLine();
        System.out.print(" 시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        // 입력받은 time 에서 second 만큼 지난 시간을 hh:mm:ss 형식으로 출력

        // 1. 입력받은 time의 초 추출
        int ss = Integer.parseInt(time.substring(4 , 6)); // 4 ~ 5 까지 인덱스 문자 추출
        // 2. 입력받은 second를 time의 초에 더한다.
        ss += Integer.parseInt( second );   // 30 + 70 => 100

        // 3. 분
        int mm = Integer.parseInt(time.substring(2 , 4)); // 2 ~ 3 까지 인덱스 문자 추출
        mm += ( ss/60 ); // 초를 60으로 나눈값 을 분에 더한다.

        // 4. 시
        int hh = Integer.parseInt(time.substring(0 , 2)); // 0 ~ 1 까지 인덱스 문자 추출
        hh += ( mm/60 ); // 분을 60으로 나눈값을 시에 더한다.
            // 만약에 시 가 표현하는 범위보다 커지면
        hh = hh > 24 ? hh-24 : hh;
        /*System.out.printf("%2s : %2s : %2s "
                , hh < 10 ? "0"+hh : hh
                , mm%60 < 10 ? "0"+mm%60 : mm%60
                , ss%60 < 10 ? "0"+ss%60 : ss%60);*/

        result = ( hh < 10 ? "0"+hh : hh ) + " : " +
                ( mm%60 < 10 ? "0"+mm%60 : mm%60 ) + " : " +
                ( ss%60 < 10 ? "0"+ss%60 : ss%60 );
        System.out.println("result = " + result);

        /*
            ex]
                time = 145930
                second = 70
                    result = 15:00:40

        */

    } // m e
} // c e
