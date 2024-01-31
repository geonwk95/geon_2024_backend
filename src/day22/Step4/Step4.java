package day22.Step4;

public class Step4 {

    // 제네릭 메소드
            // <타입파라미터> 리턴타입 메소드명(매개변수){}
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    }

    // p. 582 제네릭 메소드 : 제한된 파라미터
    public static < T extends Number > boolean compare( T t1 , T t2 ){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1 == v2;
    }

    public static void main(String[] args) {

        Box<Integer> box1 = boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.getT();
        System.out.println(strValue);







    }
}
