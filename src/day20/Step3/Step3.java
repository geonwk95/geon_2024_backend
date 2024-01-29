package day20.Step3;

public class Step3 {
    public static void main(String[] args) {

        // 1. (구현) 객체
        InterfaceCImpl impl = new InterfaceCImpl();

        // 2. 구현객체가 자식 과 부모 인터페이스에 모두 대입 가능
        InterfaceA ia = impl;
        ia.methodA();
        // ia.methodB();
        // ia.methodC();
        System.out.println();

        InterfaceB ib = impl;
        // ib.methodA();
        ib.methodB();
        // ib.methodC();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
