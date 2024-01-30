package day21.Step5;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener( new Button().ClickListener(){
            @Override
            public void onClick() {
                System.out.println("[ 익명 수현 객체를 이용한 ] OK 버튼을 클릭했습니다.");
            }
        } );

        // --- 만일 익명구현객체가 미 사용시
            // 1. 구현 클래스가 선언
        Button.ClickListener cl = new Button.Click();
            // 2. 구현객체 만들어서 사용
        button.setClickListener( cl );
    }
}
