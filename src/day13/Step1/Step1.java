package day13.Step1;

public class Step1 { // c s

    public static void main(String[] args) { // m s

        // [p.286]
            // ??? SmartPhone 클래스의 객체를 생성했는데 Phone 맴버 호출이 가능한 이유 : 상속받아서 / 물려받았기 때문에
            // JVM :
            // 1. SmartPhone객체( + Phone )
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");

            // 2. SmartPhone객체내 필드 호출( + phone 필드 호출 )
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

            // 3. SmartPhone객체내 필드 호출
        System.out.println("와이파이 상태 : " + myPhone.wifi);

            // 4.
        myPhone.bell(); // SmartPhone객체내 메소드 호출 ( + Phone 메소드 호출 )
        myPhone.sendVoice("여보세요"); // SmartPhone 객체내 메소드 호출 ( + Phone 메소드 호출 )
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요."); // SmartPhone객체내 메소드 호출 ( + Phone 메소드 호출 )
        myPhone.sendVoice("아~ 네 반갑습니다."); // SmartPhone객체내 메소드 호출 ( + Phone 메소드 호출 )
        myPhone.hangUp(); // SmartPhone객체내 메소드 호출 ( + Phone 메소드 호출 )

            // 5.
        myPhone.setWifi(true); // SmartPhone객체내 메소드 호출
        myPhone.internet(); // SmartPhone객체내 메소드 호출
    } // m e

} // c e
