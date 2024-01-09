package day06;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        
        // 1. 문자열로 받은 금액의 천단위 쉼표 넣어주는 코드
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();

        String result = "";
            // 입력받은 문자열타입의 금액을 천단위 쉼표 변환
        // result = money; // money 객체번지를 result 대입
        for ( int i = 0 ; i < money.length() ; i++){
            // System.out.println( i );
            System.out.print( i +":"+money.charAt(i) + " "); // 입력받은 문자열들을 for문 이용한 한 문자씩 추출.
            // 천단위쉼표 : 천단위마다 , 추가 , 패턴 : 3자리마다( 수 % 3 == 0 )

            if ( i > 0 && ( money.length() - i ) % 3 == 0){
                result += ",";
            }
            result += money.charAt(i);
        } // f e

        System.out.println("\n result = " + result);
    } // m e
} // c e
