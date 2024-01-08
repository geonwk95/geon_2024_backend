package day04;

public class Step2 { // class s
    public static void main(String[] args) { // main s

        // p.124
        // 1. 1 ~ 10까지 출력하는 코드
        System.out.print( 1 + " ");
        System.out.print( 2 + " ");
        System.out.print( 3 + " ");
        System.out.print( 4 + " ");
        System.out.print( 5 + " ");
        System.out.print( 6 + " ");
        System.out.print( 7 + " ");
        System.out.print( 8 + " ");
        System.out.print( 9 + " ");
        System.out.print( 10 + "\n");

        // - for 변환
        for ( int i = 1 ; i <= 10 ; i++ ){ // for s
            System.out.print( i + " " );
        } // for e

        // 2. 1 ~ 100까지 합
        int sum = 0; // 누적합계 구할려고, for 안에서도 쓰고 밖에서도 쓰고
        int i = 1;
        for ( i = 1 ; i <= 100 ; i++ ){ // for s
             sum += i;
        } // for e
        System.out.print("\nsum = : " + sum + "\n");

        // 3. 구구단 : 중첩 for문
        for (int l = 2 ; l <= 9 ; l++){ // f1 s
            for (int p = 1 ; p <= 9 ; p++){ // f2 s

                System.out.println( l + " X " + p + " = " + (l*p));
            } // f2 e

        } // f1 e

        // 4. for -> while  1 ~ 10까지
        int j = 1;
        while ( j <= 10){
            System.out.print( j + " ");
            j++;
        }

        // 5. for -> while 1 ~ 100까지 누적합계
        int sum2 = 0;
        int m = 1;
        while ( m <= 100 ){
            sum2 += m;
            m++;
        }
        System.out.println("\n1 ~ "+ (m-1) + "합 : " + sum2 );










    } // main e
} // class e
