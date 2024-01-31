package day22.Step4;

public class Box <T> {
    // 제네릭타입 : 클래스 선언시 타입을 정하지 않고 사용(객체) 생성할때 정의

    // 1. 필드
    private T t; // t필드는 제네릭타입( 정해져 있지 않다 )

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
