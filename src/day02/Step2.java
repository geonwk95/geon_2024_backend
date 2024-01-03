package day02; // 패키지명

public class Step2 { // class s
    public static void main(String[] args) { // m s

        // [p.63] 연결연산자
        int result1 = 10 + 2 + 8 ;      // 숫자일경우에는 연산
        System.out.println( result1 + "10" );   // 문자열("10")일경우에는 연결 // 2010

        // [p.64] 문자열을 기본타입으로 변환
            // - JAVA외 애플리케이션과 통신할때 [ 메모장 , HTTP , 네트워크 ]
            // HTTP로 부터 10 받음 -> 문자10
            // 메모장으로 부터 10 받음 -> 문자10
            // - 문자열 -> 기본타입( 타입클래스명.parse~~() ]
        int value1 = Integer.parseInt("10"); // "10" -> 10;
        double value2 = Double.parseDouble("3.14"); // "3.14" -> 3.14;
        boolean value3 = Boolean.parseBoolean("true"); // "true" -> true;
            // - JS에서는 데이터만 비교가 가능하지만 자바는 불가능
//        String str = "10";
//        int value = 10;
//        boolean result = str == value ? true : false;
            // 문자열(참조타입)은 연산자를 사용할수 없다.

            // - 기본타입을 문자열 변환
            // 1. String.valueOf(기본타입값);
        String str1 = String.valueOf(10);
            // 2. 기본타입값에 의미없는 "" 문자열 리터럴 연결한다
        String str2 = 10+"";

        // [p.66] 변수 사용 범위
            // - 선언된 변수는 해당 중괄호{ }블록 내에서만 사용 가능하고 밖에서는 사용할 수 없다.

        int localValue = 10;
        if( true ){
            // { } 안으로 들어갈수 있다.
            localValue++;
            //
            int localValue2 = 20;
        } // if e

        // if{} 밖에서 localValue2 호출 할수 없다.
        // localValue2++;

        // [p.67] 콘솔로 변수값 출력
        System.out.println();
             // System클래스 : 시스템 관련된 클래스[다양한 메소드와 속성(필드) 제공]
                // out : 출력 vs in : 입력
                // System.out vs System.in
                    // 1. println(); : 콘솔 출력 후 줄바꿈
                    // 2. print();   : 콘솔 출력
                    // 3. printf("형식문자열",값1,값2); // : 콘솔 형식에 맞추어 출력
        // 1. print( 리터럴 또는 변수명 )
        System.out.print(" 출력문구1 ");    // 출력만 하고 줄바꿈 안함.
        System.out.print(" 출력문구2 ");
        // 2. println( 리터럴 또는 변수명 ) : 자동완성 sout
        System.out.println(" 출력문구3 ");
        System.out.println(" 출력문구4 ");
        // 3. [p.69] printf("형식문자1",리터럴 또는 변수명); : 자동완성 souf




    } // m e

    // main() 밖에서 localValue 호출 할수 없다.

} // class e















