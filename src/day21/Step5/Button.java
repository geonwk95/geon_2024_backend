package day21.Step5;

public class Button {

    // 중첩 인터페이스
    public interface ClickListener{
        void onClick( );
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener( ClickListener clickListen ){
        this.clickListener = clickListen;
    }

    // 메소드
    public void click(){
        this.clickListener.onClick();;
    }


}
