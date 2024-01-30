package day21.Step4;

public class Step4 {
    public static void main(String[] args) {
        // home 객체 생성
        Home home = new Home();

        // 익명 구현 객체가 대입된 필드 사용
        home.use1();

        // 익명 구현 객체가 대입된 로컬 변수 사용
        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난로를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난로를 끕니다.");
            }
        });
    }
}
