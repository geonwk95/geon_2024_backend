package day13.Step4.package2;

import day13.Step4.package1.A;

public class D extends A {
    public D(){
        super();    // 부모의 생성자 호출
    }
    public void method1(){
        this.field = "value";   // 부모의 필드호출
        this.method(); // 부모의 메소드 호출
    }
    public void method2(){
        /*
        A a = new A();
        a.field = "value";      직접 객체 생성해서 사용하는 것은 안됨.
        a.method();
        */
    }


}
