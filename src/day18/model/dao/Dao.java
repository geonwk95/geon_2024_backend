package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

    /*              [ 접 근 제 한 자 ]
        public      : 모든 패키지 접근 가능
        private     : 현재 클래스 접근 가능
        protected   : 동일 패키지 접근 가능 + 상속관계 가능
        default     : 동일 패키지 접근 가능

        클래스/인터페이스   : public , default
        필드              : public , private , protected , default
        생성자             : public , private , protected , default
        메소드             : public , private , protected , default
     */





    // 1. 필드
    // DB 연동 관련 인터페이스 준비물
    protected Connection connection; // 여러 메소드 에서 사용할려고 필드로 뺀다 // 1. DB연동객체
    protected PreparedStatement preparedStatement; // 2. 작성된 SQL 을 가지고 있고, SQL 실행 담당
    protected ResultSet resultSet;    // 3. SQL 실행 결과

    // 싱글톤
    public Dao() { // 생성자 : 객체 생성시 초기화 담당
        // - 객체 생성시 db연동

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


    }
}
