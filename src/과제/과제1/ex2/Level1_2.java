package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean value1 = true;
		System.out.printf("%-10s   %15s   %30s\n" , "boolean" , value1 , "true or false");
		byte value2 = 100;
		System.out.printf("%-10s   %15s   %30s\n" , "byte" , value2 , "-128 ~ 127" );
		char value3 = 'A';
		System.out.printf("%-10s   %15s   %30s\n" , "char" , value3 , "0~65535[ character 1 ]" );
		short value4 = 30000;
		System.out.printf("%-10s   %15s   %30s\n" , "short" , value4 , "-32768 ~ 32767" );
		int value5 = 2000000000;
		System.out.printf("%-10s   %15s   %30s\n" , "int" , value5 , "-+2000 million" );
		long value6 = 400000000000L;
		System.out.printf("%-10s   %15s   %30s\n" , "long" , value6 , "-+2000 million Excess" );
		float value7 = 3.123F;
		System.out.printf("%-10s   %15s   %30s\n" , "float" , value7 , "8 decimal places" );
		double value8 = 3.12312312;
		System.out.printf("%-10s   %15s   %30s\n" , "double" , value8 , "17 decimal places" );

		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
