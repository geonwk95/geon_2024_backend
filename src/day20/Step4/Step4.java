package day20.Step4;

public class Step4 {
    // 1. 매개변수 문자의 길이 를 알려주는 함수
    public static void printLength( String data ){

        // -------------- 예외가 발생할것 같은 코드 ---------------- //
        try {
            int result = data.length(); // . (도트) : 접근연산자 : 참조객체의 인스턴스멤버 호출
            System.out.println("문자 수 : " + result);
        }
        // -------------- 예외가 발생할것 같은 코드 ---------------- //

        // -------------- 만약에 try{} 코드 안에서 예와가 발생하면 catch 실행 -- //
        catch ( NullPointerException e ){
            System.out.println( e.getMessage() );
            // System.out.println( e.toString() );
            // e.printStackTrace();
        }finally {
            System.out.println("[마무리 실행]");

        }
    }



    public static void main(String[] args) {

        // 1. [ 실행예외 - 컴파일시 예외 검사 안함 ] NullPointerException
        printLength("ThisIsJAVA");
        printLength(null); // null 이면 참조가 없으므로 .(도트) 불가능


        // 2. [ 일반예외 - 컴파일시 예외 검사 ] ClassNotFoundException

        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 종료");

        // 3.
        String[] array = { "100" , "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {

                int value = Integer.parseInt(array[i]); // "1oo" 는 정수타입으로 변환 불가능
                                                        // ArrayIndexOutOfBoundsException : 2 인덱스는 존재하지 않는다
                System.out.println(value);
            }catch ( NullPointerException | NumberFormatException e){
                System.out.println( i + " 숫자로 변환할 수 없음 : " + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println( i + " 배열 인덱스가 초과됨 : " + e.getMessage());
            }catch ( Exception e ){ // 상위 예외 클래스는 아래쪽에 작성하도록 노력하자
                System.out.println("실행에 문제가 있습니다.");
            }




        } // f e
    } // m e
} // c e
