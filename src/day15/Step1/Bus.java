package day15.Step1;

public class Bus extends Vehicle {
    // 부모 타입으로 부터 오버라이딩/재정의

    @java.lang.Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
