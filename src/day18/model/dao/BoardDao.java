package day18.model.dao;

import day18.model.dto.BoardDto;

public class BoardDao extends Dao {

    // 싱글톤
    private  BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstance(){
        return boardDao;
    }



    public boolean write(BoardDto boardDto) {
        try {
            // 1. SQL 작성
            String sql = "insert into board(mno ,cno , btitle , bcontent) values(?,?,?,?)";

            // 2. SQL 기재
            preparedStatement = connection.prepareStatement(sql);

            // ? 매개변수 대입
            preparedStatement.setInt(1,boardDto.getMno());
            preparedStatement.setInt(2, boardDto.getCno());
            preparedStatement.setString(3, boardDto.getBtitle());
            preparedStatement.setString(4, boardDto.getBcontent());

            // 3. SQL 실행
            int count = preparedStatement.executeUpdate(); // executeUpdate() 기재된 SQL 실행하고 insert된 레코드 개수 반환
            if (count == 1) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }return false;
    }





} // c e
