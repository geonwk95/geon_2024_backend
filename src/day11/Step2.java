package day11;

import day11.exam01.package2.C;

public class Step2 {

    public static void main(String[] args) {

        // 1. 객체 생성
        Car mycar = new Car();

        // speed 필드가 private 이므로 외부에서 접근 불가능
        // mycar.speed = -50;

        mycar.setSpeed(-50); // 유효성검사
        System.out.println("현재 속도 : " + mycar.getSpeed());

        mycar.setSpeed(60);
        System.out.println("현재 속도 : " + mycar.getSpeed());

        // 멈춤
        if ( !mycar.isStop() ){
            mycar.setStop(true);
        }
        System.out.println("현재속도 : " + mycar.getSpeed());

    }
}
