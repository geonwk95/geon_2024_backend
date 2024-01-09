package 과제.과제3.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		
		int july1 = 3532100; 
		int july2 = 9123700;
		int july3 = 5183400;
		int july4 = 11738700;
		
		/* 문제풀이 위치 */
		/*String a = Integer.toString(july1);
		String b = Integer.toString(july2);
		String c = Integer.toString(july3);
		String d = Integer.toString(july4);

		System.out.println("------- 7월 매출액 ---------");
		int 나눈a = july1/10000;
		int 나눈b = july2/10000;
		int 나눈c = july3/10000;
		int 나눈d = july4/10000;

		String[] 배열 = new String[]{a,b,c,d};
		char 네모 = '■';
		for ( int i = 0 ; i <= 배열.length ; i++){
			System.out.println("");
		}*/

		System.out.println("----------- 7월 매출액 --------------");
		int[] 배열 = new int[]{july1,july2,july3,july4};
		for (int i = 0 ; i < 배열.length ; i++){
			int a = 배열[i]/1000000; // 3 // 네모의 개수
			String b = "";
			for (int j = 0 ; j < a ; j++){
				b += "■";
			}
			System.out.println((i+1)+"주차 : " + b + 배열[i]/10000+"만원");
		}

		/* ----------- */
	}
}
/* 
	[문제] 
		다음과 같이 july1,july2,july3,july4 변수는 7월의 1주차,2주차,3주차,4주차 의 매출액이 저장된 변수 입니다.
		1. 주차별로 100만원당 도형 '■' 출력하시오.
		2. 도형 뒤로는 그림과 같이 만원대 까지만 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.

*/
