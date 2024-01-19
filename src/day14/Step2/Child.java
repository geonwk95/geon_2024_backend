package day14.Step2;

public class Child extends Parent{
    // 필드
    public String field2;




    @Override // 재정의(오버라이딩) : 상속받았을때[extends Parent] 부모 메소드 재정의
    public void method1() { // 부모 클래스내 메소드와 선언부를 동일하게
        System.out.println("Child.method1");
    }
    @Override
    public void method2() {
        System.out.println("Child.method2");
    }
}

