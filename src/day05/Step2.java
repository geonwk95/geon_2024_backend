package day05;

public class Step2 {//class start

    public static void main(String[] args) {//main start
        // p.165 : 배열(array) 타입
            /*
                - 변수는 하나의 값만 저장.
                1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스 부여.
                    - 인덱스 : 각 항목(요소)의 값을 호출 하거나 저장하는데 사용됨.
                2. 특징
                    1. 배열은 같은 타입의 값만 저장
                        int = [ 57 , "가" ]  불가능.
                    2. [고정길이] 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다.
                        int = [ 57 , 62 , 97 ] : 항목/요소를 추가/삭제 할수 없다.
                        - 새로운 배열을 다시 만들고 기존배열을 복사해서 새로운 값 대입.
                3. 선언
                    - 변수선언 : 타입 변수명;
                    - 배열선언 : 타입[] 변수명; or  타입 변수명[];

                4. 값 목록으로 배열 선언
                    - 배열생성1 : 타입[] 변수명 = { 값0 , 값1 , 값2 , 값3 };
                        - 배열에 넣을 초기값을 알고 있을때 사용
                    - 배열생성2 : 타입[] 변수명 = new 타입[ 길이 ];
                        - 배열에 넣을 초기값을 모르고 배열의길이(최대저장개수) 를 알고있을때 사용
                        - 초기값 : 정수 0 , 실수 0.0 , 논리 false , 클랙스(String)/인터페이스 null
                        - 주의할점
                            1. 지역변수 X
                            2. 배열 적용.
                            3. 필드 적용.

                5. 배열의 길이를 구하는 속성명
                    - 배열명.length;       : 현재 배열의 길이를 알려준다.

                6. 배열 항목/요소 값 넣기
                    - 배열명[인덱스] = 새로운값;
                7. 배열 항목/요소 값 호출
                    - 배열명[인덱스]
                8. 배열 항목/요소 값 수정
                    - 배열명[인덱스] = 새로운값;
                9. 배열 항목/요소 값 삭제 [ 항목/요소 위치 삭제는 없고 초기값을 넣는다 ]
                    - 배열명[인덱스] = 각 타입의 초기값
                                    null , 0 , 0.0 , false

            */
        // 1. 배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언.
        String season1 = "Spring";
        String season2 = "Summer";
        String season3 = "fall";
        String season4 = "winter";
             // 배열이 없다면 vs 배열 있다면
        String[] season = { "Spring" , "Summer" , "Fall" , "Winter" };

        // 2. 배열의 각 요소/항목의 값 호출

        // 1. 일반호출
        System.out.println("season[0] : "+season[0]);
        System.out.println("season[1] : "+season[1]);
        System.out.println("season[2] : "+season[2]);
        System.out.println("season[3] : "+season[3]);
        // System.out.println("season[4] : "+season[4]);

        // 2. for반복문을 이용한 호출
        for( int i = 0 ; i < season.length ; i++){
            System.out.println("season["+i+"] : "+season[i]);
        }

        // 3. 각 요소/항목의 값 수정
        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);

        // - int형 여러개 데이터를 저장하는 배열 선언.

        // 1. int형 83,90,87 3개 정수를 저장하는 배열 선언
        int[] scores = { 83 , 90 , 87 };
        // 2. 배열내 항목/요소 총합계
        int sum = 0;
        for( int i = 0 ; i < 3 ; i++ ){
            // i는 0부터 3미만 까지 1씩 증가
            sum += scores[i]; // i번째 인덱스 항목에 값을 sum변수에
        }
        System.out.println("sum : " + sum);
        double avg = (double) sum/3;
        System.out.println("avg = " + avg);

        // p.173
            // new 연산자를 이용한 배열 선언
            // 1. int[] arr1 = new int[3]; // 타입[] 변수명 = new 타입[길이];
            // 2. for 이용한 배열내 모든 요소 호출
            int[] arr1 = new int[3];

            for (int i = 0; i<3 ; i++){
                System.out.println("[" + i + "] : " + arr1[i] + ",");
            }

            arr1[0] = 10;
            arr1[1] = 20;
            arr1[2] = 30;

            for (int i = 0; i<3 ; i++){
                System.out.println("[" + i + "] : " + arr1[i] + ",");
            }

    }//main End
}//class End
