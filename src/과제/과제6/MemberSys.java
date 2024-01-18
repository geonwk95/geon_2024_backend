package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	static Member[] members = new Member[100];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {





		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
			회원가입();
			}
			else if( ch == 2 ) {
			로그인();
			}
			else if( ch == 3 ) {
			아이디찾기();
			}
			else if( ch == 4 ) {
			비밀번호찾기();
			}

		} // w e
	} // m e

	public static void 회원가입(){
		Scanner scanner = new Scanner(System.in);

		// 1. 입력받기
		System.out.println("MemberSys.회원가입");
		System.out.print("아이디 : "); String id = scanner.next();
		System.out.print("비밀번호 : "); String pw = scanner.next();
		System.out.print("이름 : "); String name = scanner.next();
		System.out.print("전화번호 : "); String phone = scanner.next();
		System.out.print("나이 : "); String age = scanner.next();

		// 2. 객체화
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setPhone(phone);
		member.setAge(age);
		for (int i = 0 ; i < members.length ; i++){
			if ( members[i] == null ){
				members[i] = member;

				break;
			}
		}
		System.out.println("회원가입 성공");
	}
	public static void 로그인(){
		Scanner scanner = new Scanner(System.in);
		// 1. 입력받기
		System.out.print("아이디 : "); String id = scanner.next();
		System.out.print("비밀번호 : "); String pw = scanner.next();

		// 2.객체화
		Member member = new Member();
		member.getId();
		member.getPw();
		boolean 일치여부 = false;
		for (int i = 0 ; i < members.length ; i++){
			if (members[i] != null){
				if (members[i].getId().equals(id) && members[i].getPw().equals(pw)){
					System.out.println("로그인 성공");
					일치여부 =true;
					break;
				}else {
					일치여부 =false;
				}
			}
		}
		if(!일치여부){System.out.println("로그인 실패");}
	}
	public static void 아이디찾기(){
		Scanner scanner = new Scanner(System.in);
		// 1.입력받기
		System.out.print("이름 : "); String name = scanner.next();
		System.out.print("전화번호 : "); String phone = scanner.next();

		// 2.객체화
		Member member = new Member();
		member.getName();
		member.getPhone();
		boolean 일치여부 = false;
		for (int i = 0 ; i < members.length ; i++){
			if (members[i] != null){
				if (members[i].getName().equals(name) && members[i].getPhone().equals(phone)){
					System.out.println("찾고계신 아이디 : "+members[i].getId()+"입니다.");
					일치여부 =true;
					break;
				}else {
					일치여부 = false;
				}
			}
		}if (!일치여부){System.out.println("찾고계신 아이디가 없습니다.");}

	}
	public static void 비밀번호찾기(){
		Scanner scanner = new Scanner(System.in);
		// 1. 입력받기
		System.out.print("아이디 : "); String id = scanner.next();
		System.out.print("전화번호 : "); String phone = scanner.next();

		// 2. 객체화
		Member member = new Member();
		member.getId();
		member.getPhone();
		boolean 일치여부 = false;
		for (int i = 0 ; i < members.length ; i++){
			if (members[i] != null){
				if (members[i].getName().equals(id) && members[i].getPhone().equals(phone)){
					System.out.println("찾고계신 비밀번호 : "+members[i].getPw()+"입니다.");
					일치여부 =true;
					break;
				}else {
					일치여부 = false;
				}
			}
		}if (!일치여부){System.out.println("찾고계신 비밀번호가 없습니다.");}

	}
} // class e




/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














