package day05;

import java.util.Scanner;

public class Step3_방문록_배열버전 { // class s

    public static void main(String[] args) { // main s

        // *입력객체
        Scanner scanner = new Scanner(System.in);
        // 5. 저장할 (배열)변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호 = new int[3];

        // 1. 무한루프
        while (true){ // w start
            // 2. 출력
            System.out.println("============ 방문록 =============");
            // 7. for문 이용한 배열내  모든 항목/요소 호출 : 0부터 2까지 1씩증가. 나머지는 코드가 반복되면 반복문
            for ( int i = 0 ; i < 내용배열.length ; i++ ){
                // 타입은 클래스 이지만. null 비교시에는 비교연산자 사용.
                if ( 내용배열[i] != null ){
                    System.out.printf("%2d \t %-5s \t %-20s\n", 1+i , 작성자배열[i],내용배열[i]);
                }
                }


            System.out.println("1.방문록 작성 2.방문록 삭제 3.종료 ");

            // 3. 입력
            System.out.println(" 선택 > ");
            int ch = scanner.nextInt();

            // 4. 입력에 따른 경우의수 판단
            if( ch == 1){
                // 6-1 방문록 작성할 위치(인덱스) 입력받는다.
                System.out.print("방문록 작성위치를 정해주세요( 1~3 ) : ");
                int 작성위치 = scanner.nextInt();
                // 6-2 입력 : 내용 , 작성자 , 비밀번호 각각 입력받기.
                scanner.nextLine();
                System.out.print("내용 : "); String content = scanner.nextLine();
                System.out.print("작성자 : "); String writer = scanner.nextLine();
                System.out.print("비밀번호 : "); int password = scanner.nextInt();
                // 6-3 저장
                내용배열[ 작성위치-1 ] = content;
                작성자배열[ 작성위치-1 ] = writer;
                비밀번호[ 작성위치-1 ] = password;

            } else if ( ch == 2) {
                // 8-1 입력 : 삭제할 방문록의 위치[인덱스] 입력
                System.out.print("방문록 삭제위치를 정해주세요( 1~3 ) : ");
                int 작성위치 = scanner.nextInt();
                // 8-2 입력 : 유효성검사를 위한 비밀번호 입력받기
                System.out.print("비밀번호를 작성해주세요 : ");
                int password = scanner.nextInt();
                // 8-3 초기화 : 만약에 인덱스가 없는 번호를 선택했을때
                if ( 작성위치 < 1 || 작성위치 > 내용배열.length ){
                    System.out.println("\n[ 경고 ] 알수없는 위치입니다.\n");
                }   // 만약에 선택한 방문록의 패스워드 와 방금 입력한 패스워드가 같으면.
                else if( 비밀번호[ 작성위치-1] == password ){
                    // 배열의 항목/요소의 자리/길이 삭제할수 없으므로 초기값으로 대입.
                    내용배열[작성위치-1] = null; 작성자배열[작성위치-1] = null; 비밀번호[작성위치-1] = 0;
                }else {
                    System.out.println("[경고] 비번틀림");
                }

            } else if ( ch == 3) {
                break;
            } else {
                System.out.println("[경고]알수없는 입력입니다.");
            };

        } // w e

    } // main e

} // class e
