package day16.Step1;

public class Step1 {

    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
        RemoteControl remoteControl;
        // 2. 인터페이스 변수에 객체참조 값 대입                   // == RemoteControl remoteControl = new Television();
        remoteControl = new Television(); // - 다형성
            // 타입이 다른데 가능한 이유 : extends , implements
        // 3. 인터페이스의 메소드를 호출하면 구현객체의 메소드가 호출된다.
        remoteControl.turnOn();
        remoteControl.setMaxVolume(5); // 텔레비전의 볼륨 5로 설정
        remoteControl.turnOff();    // 텔레비전을 끕니다.

        remoteControl = new Audio(); // - 다형성

        remoteControl.turnOn();
        remoteControl.setMaxVolume(5); // 오디오의 볼륨 5로 설정
        remoteControl.turnOff();        // 텔레비전을 끕니다.

        // 인터페이스의 상수필드 호출
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);


    } // m e
} // m s
