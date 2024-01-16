package day11;

public class Car {

    // 클래스 멤버
        // 1. ( public , private , 생략시 : default) (정적/인스턴스 , final ) 필드
    private int speed;  // private 인스턴스 필드
    private boolean stop; // private 인스턴스 필드
        // 2. ( public , private , 생략시 : default)생성자

        // 3. ( public , private , 생략시 : default) (정적/인스턴스) 메소드

            // 1. 외부로 부터 필드값을 반환해주는 메소드
    public int getSpeed(){
        return this.speed;
    }
            // 2. 외부로 부터 매개변수 값을 유효성검사를 통해 필드 값을 변경
    public void setSpeed(int speed){
        if (speed < 0){
            this.speed = 0;
            return;
        }else {
            this.speed = speed;
        }

    }

            // 3. 외부로 부터 필드값을 반환해주는 메소드 boolean 이면 is필드명
    public boolean isStop(){
        return this.stop;
    }

            // 4. 외부로 부터 매개변수 값을 유효성검사를 통해 필드 값을 변경
    public void setStop(boolean stop){
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }



}
