package day10;

public class Car {

    // 클랙스 멤버
    // 1. 필드
    int gas;

    // 2. 생성자

    // 3. 메소드

        // 1. 필드값 변경하는 메소드 [ 매개변수 : int / 리턴 : x ]
    void setGas(int gas){
        this.gas = gas;
    }
        // 2. 필드 값에 따른 결관반환메소드 [ 매개변수:x / 리턴 : boolean ]
    boolean isLeftGas(){
        if ( gas == 0){
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
        // 3. 필드 값이 0이면 무한루프가 종료되는 함수 [ 매개변수 : x / 리턴 : x ]
    void run(){
        while (true){
            if (gas > 0){
                System.out.println("달립니다.(gas잔량:"+gas+")");
                gas--;
            }else {
                System.out.println("멈춥니다.(gas잔량:"+gas+")");
                return; // 메소드 종료 => 무한루프 종료
            }
        }
    }


}
