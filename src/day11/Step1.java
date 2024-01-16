package day11;

public class Step1 {
    public static void main(String[] args) {

        // 1.
        Korean k1 = new Korean("123456-1234567" , "김자바");

        // 2. 필드 호출
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // 3. 필드의 값 수정
        // k1.nation = "일본";   // final 초기화 이후 수정불가.

        k1.name = "김건우";
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);


        // 상수 읽기
        System.out.println("지구의 반지름 : " + Korean.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적 : " + Korean.EARTH_SURFACE_AREA + "km^2");



    } // m e
} // c e
