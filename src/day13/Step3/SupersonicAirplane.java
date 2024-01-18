package day13.Step3;

import day13.Step3.Airplane;

public class SupersonicAirplane extends Airplane {

    /*

        필드/메소드
            1. [내부 객체] 선언한 클래스내 호출시
                - 객체 없이 필드/메소드 호출
                - this.필드/메소드
            2. [외부] 선언한 클래스가 아닌 다른 클래스에서 호출시
                - 인스턴스 필드 : new 이용한 객체가 필수!! 객체변수명.필드/메소드
                - 정적 필드 : 객체가 필요없음 : 클래스명.필드/메소드

     */


    // 1. 상수 필드
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    // 1-1 인스턴스 필드
    public int flyMode = NORMAL;
    // 2. 생성자

    // 3. 메소드
    public void fly(){
        if (flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else {
            super.fly(); // 부모(Airplane)객체 의 fly() 메소드 호출
        }
    }


}
