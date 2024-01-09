package day06;  // 패키지 이름

import java.util.Scanner;

public class Step6 {    // class S

    // 3. 전화번호부 만들기
    public static void main(String[] args) {    // main S
        String 전화번호부 = "";

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("============= 전화번호부 =============");
            System.out.printf("%-5s\t%-8s\t%-13s\n","순번","이름","전화번호");
            for(int i = 0; i<전화번호부.split("/").length; i++){
                if(!전화번호부.equals("")){
                    System.out.printf("%-5s\t%-8s\t%-13s\n",
                            i+1, // 순번
                            전화번호부.split("/")[i].split(",")[0], // 이름
                            전화번호부.split("/")[i].split(",")[1]); // 전화번호
                }
            }
            System.out.println("\n1.전화번호등록 2.전화번호삭제");

            System.out.print("선택 > ");
            String ch = scanner.nextLine();
            if(ch.equals("1")){
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("전화번호 : ");
                String phone = scanner.nextLine();
                전화번호부 += name + ","+phone + "/";
            } else if (ch.equals("2")){
                System.out.print("삭제할 순번 > ");
                int num = scanner.nextInt();scanner.nextLine();
                String 전화번호부_복제 = "";
                for(int i=0; i<전화번호부.split("/").length; i++){
                    if(i!=num-1){
                        전화번호부_복제 += 전화번호부.split("/")[i] + "/";
                    }
                }

                전화번호부 = 전화번호부_복제;

            } else {
                System.out.println("번호를 다시 입력해주세요.");
            }

        }
    }   // main E


}   // class E
