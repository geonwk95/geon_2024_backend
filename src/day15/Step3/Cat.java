package day15.Step3;

public class Cat extends Animal{
    // 만일 상위클래스가 추상메소드가 있으면 필수/꼭!!!!!!!!
    // 부모클래스의 추상메소드를 재정의/오버라이딩 한다.
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
