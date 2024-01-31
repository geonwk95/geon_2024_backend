package day22.Step3;

public interface Rentable <P>{
    // 인터페이스 제네릭타입 가능
    // 1. 추상메소드( public abstract 생략가능 )
        // 메소드의 반환타입을 제네릭타입 P
    P rent();
}
