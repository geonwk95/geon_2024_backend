package 과제.과제5;

import java.util.Arrays;
import java.util.Scanner;

public class MemberSys {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Member[] member1 = new Member[10];
		System.out.println(member1);

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인    선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) { // 회원가입
				// 1.입력받기
				System.out.print("아이디 : "); String id = sc.next();
				System.out.print("비밀번호 : "); String pw = sc.next();
				System.out.print("이름 : "); String name = sc.next();
				System.out.print("전화번호 : "); String phone = sc.next();
				System.out.print("나이 : "); String age = sc.next();

				// 2.객체화
				Member member = new Member();
				member.id = id;
				member.pw = pw;
				member.name = name;
				member.phone = phone;
				member.age = age;
				for (int i = 0 ; i < member1.length ; i++){
					if (member1[i] == null) {
						member1[i] = member;
						System.out.println(member1[i].age);

						break; // 회원가입 출력 한번
					}
				}
				System.out.println("회원가입 성공");




			}
			else if( ch == 2 ) {
				System.out.print("아이디 : "); String id = sc.next();
				System.out.print("비밀번호 : "); String pw = sc.next();

				for (int i = 0 ; i < member1.length ; i++){
					if( member1[i] != null){
						if (member1[i].id.equals(id) && member1[i].pw.equals(pw) ){
							System.out.println("로그인 성공");
						}else {
							System.out.println("로그인 실패");
						}
					}

				}

			}

		} // w e 
	} // m e 
} // c e 


/*
 	주제 : 회원제 시스템 part1
 		- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 새로운 메소드를 생성 하지 마시오.

 		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이

		[ MemberSys 클래스 ]
 		1. 초기 메뉴 [ 무한루프 ]
 			1. 회원가입 2.로그인 
 			
 		2. 조건 기능 
 			1. 회원가입 선택시
 				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
 				2. Member 객체화
 				3. 객체를 배열 저장 
 				 
 			2. 로그인 선택시
 				1. 아이디 , 비밀번호 입력받아 저장 
 				2. 입력받은 값과 배열내 동일한 값 찾기
 					- 만약에 동일한 값 있으면 로그인 성공 
 					- 아니면 실패
*/





