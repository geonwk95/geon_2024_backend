package day21.Step1;

public class Step1 {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (Exception e){
            System.out.println("e = " + e);
        }
        System.out.println("args = " + args);



    } // m e
                                    // 2.
    public static void findClass() throws ClassNotFoundException{
        // 예외 발생
            // 1. try{} catch(){}   : 해당 코드 직접 예외처리
            // 2. throws            : 예외 떠넘기기
        // 1.
        try {
            Class.forName("java.lang.String");
        }catch ( ClassNotFoundException e ){
            System.out.println("e = " + e);
        }

        // 2. 해당 메소드 옆에 선언
        Class.forName("java.lang.String2");
    }

}
