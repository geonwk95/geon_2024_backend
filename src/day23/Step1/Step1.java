package day23.Step1;

import java.util.ArrayList;
import java.util.Arrays;


public class Step1 {

    public static void main(String[] args) {


        // 1. 배열타입 = 고정길이
            // 객체{ 객체 , 객체 , 객체 }
        String[] strArray = new String[3];  // String 타입 데이터/객체 3개를 저장/참조 하는 배열타입
        strArray[0] = "유재석";
        // strArray[1] = 100; // x 타입이 다르니까 오류
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        // strArray[3] = "서장훈"; // x ArrayIndexOutOfBoundsException

        System.out.println("리스트 상태 : " + Arrays.toString( strArray ) ); // Object 클래스 toString( )메소드 객체의 주소값 대입
            // Arrays.toString( 배열타입변수 ) : 해당 배열 상태 호출
        System.out.println("리스트 요소호출 : " + strArray[1]);
        System.out.println("리스트 길이 : " + strArray.length );

        System.out.println();

        // 2. 클래스타입 : 컬렉션프레임워크( 수집관련 라이브러리 제공 )
            // 객체{ 객체 , 객체 , 객체 }
            // 1. ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
        // 클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
        // strList.add( 100 );
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");

        System.out.println("리스트 상태 : " + strList);
        System.out.println("리스트 요소 호출 : " + strList.get(1));
        System.out.println("리스트 길이 : " + strList.size() );
        strList.remove(1); // 1번 인덱스 삭제
        System.out.println("1번 인덱스 삭제 후 리스트 상태 : " + strList);
        System.out.println("리스트 요소 호출 : " + strList.get(1));

        System.out.println();

        // 3. 가변길이 배열 객체 만들기
        // SimpleList{ 객체 , 객체 , 객체 }
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println("리스트 상태 : " + simpleList.toString() );
        System.out.println("리스트 요소 호출 : " + simpleList.get(1));
        System.out.println("리스트 길이 : " + simpleList.size() );
        simpleList.remove(1); // 1번 인덱스 삭제
        System.out.println("리스트 상태 : " + simpleList.toString() );
        // simpleList.add(100);

        /*SimpleList<Integer> intList = new SimpleList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        intList.add(400);*/











    } // m e

} // c e
