package day21.Step3;

public class Step3 {
    public static void main(String[] args) {

        Car car = new Car();

        car.run1();

        car.run2();


        // ☆ 매개변수에 익명 자식 객체 대입
        car.run3( new Tire(){
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.");
            }
        } );

        // - 1
        Tire tire = new Tire(){
          // ============ Tire 클래스로 부터 상속 받은 객체 정의 ============= //
            // class 자식클래스명 extends Tire{ }
                // ☆☆☆☆ : 자식객체
            // 필드 생성 가능
            int a = 10;
            // 생성자 X
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다2.");
            }
            // ============ Tire 클래스로 부터 상속 받은 객체 정의 ============= //
        };
        // - 2
        car.run3( tire );

    } // m e
} // c e
