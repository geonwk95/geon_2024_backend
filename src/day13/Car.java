package day13;

public class Car {
    // 1. 필드
    public int speed;

    // 2. 생성자

    // 3. 메소드
    public void speedUp(){
        speed += 1;
    }
    public void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
