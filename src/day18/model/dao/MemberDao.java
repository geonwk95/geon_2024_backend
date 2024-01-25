package day18.model.dao;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao{

    /*// 1. 필드
    // DB 연동 관련 인터페이스 준비물
    private Connection connection; // 여러 메소드 에서 사용할려고 필드로 뺀다 // 1. DB연동객체
    private PreparedStatement preparedStatement; // 2. 작성된 SQL 을 가지고 있고, SQL 실행 담당
    private ResultSet resultSet;    // 3. SQL 실행 결과*/

    // 싱글톤
    private MemberDao() { // 생성자 : 객체 생성시 초기화 담당
       /* // - 객체 생성시 db연동

        try {
            // 1. MYSQL 회사의 JDBC 관련된 (Driver)객체를 JVM 에 로딩한다/불러오기
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연동된 결과의 객체를 Connection 인터페이스에 대입한다
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    "1234"
            );
            System.out.println("DB 연동 성공");
        } catch (Exception e) {
            System.out.println("DB 연동 실패" + e);
        }


    */
    }

    private static MemberDao memberDao = new MemberDao();

    public static MemberDao getInstance() {
        return memberDao;
    }

    // 1. 회원가입
    public int signup(MemberDto memberDto) {
        try {
            // 1. SQL 작성 [ 변수가 들어갈 자리에는 ? 대체한다 ]
            String sql = "insert into member(mid , mpw , mphone)values(?,?,?)";
            // 2. SQL 기재
            preparedStatement = connection.prepareStatement(sql);
            // ? 매개변수 대입
            preparedStatement.setString(1, memberDto.getMid());     // 기재된 SQL내 첫번째 ? 에 값 대입
            preparedStatement.setString(2, memberDto.getMpw());     // 기재된 SQL내 두번째 ? 에 값 대입
            preparedStatement.setString(3, memberDto.getMphone());  // 기재된 SQL내 세번째 ? 에 값 대입
            // 3. SQL 실행
            int count = preparedStatement.executeUpdate(); // executeUpdate() 기재된 SQL 실행하고 insert된 레코드 개수 반환
            if (count == 1) {
                return 0;
            } // 만약에 insert 처리된 레코드가 1개이면 회원가입 성공
            // 4. SQL 결과

        } catch (Exception e) {

        }
            // 5. 함수 종료
            return 1; // 실패


    }
    // 0. 아이디 검사용( 아이디 중복검사 용도 )
    public boolean idCheck( String mid ){
        try {
            // 1. SQL 작성한다
            String sql = "select mid from member where mid = ? ";
            // 2. SQL 기재한다
            preparedStatement = connection.prepareStatement(sql);
            // + ? 매개변수 대입
            preparedStatement.setString(1, mid); // sql 문법내 첫번째 ? 에 mid 변수 값 대입
            // 3. SQL 실행한다
            resultSet = preparedStatement.executeQuery(); // 질의/검색 (select) 결과를 resultSet 인터페이스에 대입한다
            // 4. SQL 결과처리
            if (resultSet.next()) {    // resultSet.next() : 검색 결과 테이블에서 다음레코드 이동
                return true; // 아이디 중복 있음
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return false; // 아이디 중복 없음
    } // 아이디 검사 e

    // 2. 로그인
    public boolean login(MemberDto memberDto){
        try {
            // 1. SQL 작성한다
            String sql = "select * from member where mid = ? and mpw = ? ";
            // 2. SQL 기재한다
            preparedStatement = connection.prepareStatement(sql);
            // ? 매개변수 대입
            preparedStatement.setString(1, memberDto.getMid()); // sql 문법내 첫번째 ? 에 매개변수 값 대입
            preparedStatement.setString(2, memberDto.getMpw()); // sql 문법내 두번째 ? 에 매개변수 값 대입
            // 3. SQL 실행한다
            resultSet = preparedStatement.executeQuery();
            // 4. SQL 결과처리
            if (resultSet.next()) { // 만약에 select의 결과물이 하나의 레코드가 존재하면 로그인 성공
                return true;
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        // 5. 함수 종료
        return false;
    }

    // 0.
    public int findMno(String mid){
        try {
            // 1. SQL 작성한다
            String sql = "select mno from member where mid = ? ";
            // 2. SQL 기재한다
            preparedStatement = connection.prepareStatement(sql);
            // ? 매개변수 대입
            preparedStatement.setString(1, mid);
            // 3. SQL 실행한다
            resultSet = preparedStatement.executeQuery();
            // 4. SQL 결과처리
            if (resultSet.next()) {
                // resultSet.next() : 다음 레코드 이동
                // resultSet.get타입( 호출할 필드 번호 or 필드이름 ) : 현재 레코드의 필드 값 호출
                return resultSet.getInt("mno");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
            return 0;

    }




}
