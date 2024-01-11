package day08;


import java.util.Arrays;
import java.util.Scanner;

// =================== 클래스 용동 : 1.main() ================= //
public class Step1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[10];
                        // 500번지{ 500번지[null] , 500번지[null] , 500번지[null] , 500번지[null] , 500번지[null] ,}
                        // 첫번째 붕어빵 구웠을때
                        // 500번지{ 500번지[101번지} , 500번지[null] , 500번지[null] , 500번지[null] , 500번지[null] ,}
                        // 두번째 붕어빵 구웠을때
                        // 500번지{ 500번지[101번지} , 500번지[102번지] , 500번지[null] , 500번지[null] , 500번지[null] ,}
        while (true){
            System.out.println(Arrays.toString(붕어빵트레이));
            System.out.println("1.굽기 2.판매 : ");
            int ch = scanner.nextInt();

            if (ch==1){

                System.out.print("속재료 : "); String 입력속재료 = scanner.next();

                // 1. 객체생성 : 1. new -> 2. 클래스/생성자()
                붕어빵틀 붕어빵 = new 붕어빵틀(); // (1개의 주소 생성)붕어빵 생성.
                            // 101번지{ }

                붕어빵.속재료 = 입력속재료;

                for ( int i = 0 ; i < 붕어빵트레이.length ; i++ ){
                    // 만약에 i번째 공간이 비어있으면 거기에 붕어빵 넣어라
                    if (붕어빵트레이[i]==null){
                        붕어빵트레이[i] = 붕어빵;
                        break; // 트레이[배열] 에 붕어빵 넣었으면 끝
                    }
                }
                붕어빵트레이[0] = 붕어빵; // if끝나면 객체를 참조하는 변수는 사라지는데.. 얼른 객체의 참조주소를 옮기자

            } // if가 끝나면 '붕어빵'의 지역변수는 사라짐 -> 곧 객체도 사라짐.
            if (ch==2){
                System.out.print("판매할 붕어빵 위치 : ");
                int dNo = scanner.nextInt();

                // - 자바는 힙영역에 객체를 제거하는 방법을 제공하지않는다. 그래서 초기값(null) 활용
                붕어빵트레이[ dNo ] =null;
                // - 만약에 삭제할 객체 인덱스 뒤로 객체가 존재하면 한칸씩 당기기
                for (int i = dNo ; i < 붕어빵트레이.length ; i++){
                    // i는 삭제할 객체의 인덱스 위치 부터 마지막 인덱스까지 반복
                    붕어빵트레이[i] = 붕어빵트레이[i+1];
                }
            }


        }



    } // m e
} // c e
