package day11.exam01.package1.sub;

import day11.exam01.package1.A2;

public class D {
    // 하위 패키지  : public ,protected 만 가능
    public void method(){
        A2 a = new A2();

         a.field1 = 1; // public 필드는 하위패키지에서 접근가능
         //a.field2 = 1; // (default) 필드는 하위패키지에서 접근불가능
         //a.field3 = 1; // private 필드는 하위패키지에서 접근 불가능

         a.method1(); // public 메소드는 하위패키지에서 접근가능
         //a.method2(); // (default) 메소드는 하위패키지에서 접근불가능
         //a.method3(); // private 메소드는 하위패키지에서 접근불가능
    }
}
