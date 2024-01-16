package day11.exam01.package1;

public class A2 {

    // + 필드 와 메소드 접근제한자
    public int field1;      // public 필드
    int field2;             // (default) 필드
    private  int field3;    // private 필드

    public A2(){
        field1 = 1; // public 필드는 내부에서 접근가능
        field2 = 1; // (default) 필드는 내부에서 접근가능
        field3 = 1; // private 필드는 내부에서 접근가능

        method1(); // public 메소드는 내부에서 접근가능
        method2(); // (default) 메소드는 내부에서 접근가능
        method3(); // private 메소드는 내부에서 접근가능
    }

    //
    public void method1(){}
    void method2(){}
    private void method3(){}

    // + 생성자 전급제한자
    A2 a1 = new A2(true);       // public 생성자       // 모든패키지 O
    A2 a2 = new A2(1);          // (default) 생성자    // 다른패키지 X
    A2 a3 = new A2("문자열");      // private 생성자    // 클래스 내부에서만 사용

    public A2(boolean b){}          // 내부에서 생성자호출 가능

    A2(int b){}                     // 내부에서 생성자호출 가능

    private A2(String s){}          // 내부에서 생성자호출 가능
}
