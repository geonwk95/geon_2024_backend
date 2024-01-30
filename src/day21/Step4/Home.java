package day21.Step4;

public class Home {

    // 1. 필드에 익명 구현 객체 대입
        // 1. 인터페이스는 추상메소드[선언부 O 실행부 X] 가 존재하므로 객체 생성 불가
            // 실행부를 구현(오버라이딩)
            // 1. 구현클래스     : class 클래스명 implemanets 인터페이스명{ }
            // 2. 익명 구현 객체 : new 인터페이스명(){ }
    private RemoteControl rc = new RemoteControl(){

        // 1. 필드 가능
        int a = 0;
        // 2. 생성자 X : 이미 익명 구현 객체를 만들고 있기 때문에 만들필요가 없다

        // 3. 메소드 가능
        public void method(){}

        // ☆ 오버라이딩
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };
    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    // 2. 지역 변수에 익명 구현 객체 대입
    public void use2(){
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 3. 매개 변수에 익명 구현 객체 대입
    public void use3( RemoteControl rc ){
        rc.turnOn();
        rc.turnOff();
    }













}
