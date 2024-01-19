package day13.Step1;

import day13.Step1.Phone;

/*

    상속
        - 클래스를 재사용해서 새로운 클래스를 만들때 중복되는 코드를 줄여 개발시간을 단축 / 유지보수
        1. 부모클래스의 필드/메소드를 자식클래스에게 물려받는다.
        2. 자식이 부모를 선택한다.
        3. 자식클래스 선언시 클래스명 뒤에 extends
        4. 자식클래스가 가질수 있는 부모의 개수는 1개 = 다중 상속 불가능.

 */
public class SmartPhone extends Phone {

    // 1. 필드
    public boolean wifi;
    // 2. 생성자
    public SmartPhone(String model , String color){
        // - 생성자 첫줄에 부모 생성자 호출한다.( 생량가능 - 컴파일시 자동추가 )
        super();


        // * this : 현재 객체 뜻 하는 키워드
        this.model = model;
        this.color = color;
    }
    // 3. 메소드
        // 1. 매개변수 : boolean , 반환값 : x
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상대틀 변경했습니다.");
    }
    // 2. 매개변수 : x , 반환값 : x
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }


}
