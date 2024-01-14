package day10;

public class Step3 {
    public static void main(String[] args) {

        // [p.237]
            // 1. 객체 생성
        Car mycar = new Car();
            // 2. 필드에 5저장.
        mycar.gas = 5;
            // vs
        mycar.setGas(5);

        if (mycar.isLeftGas()){
            System.out.println("출발합니다.");
            mycar.run();
        }
        System.out.println("gas를 주입하세요.");

    } // m e
} // c e
