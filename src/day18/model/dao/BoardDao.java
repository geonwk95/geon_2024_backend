package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao {

    // 싱글톤
    private  BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstance(){
        return boardDao;
    }


    // 글쓰기
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


    // 카테고리 선택
    public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){
        try {
            String sql ="select * from category order by cno";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            ArrayList<CategoryDto>categoryDtos = new ArrayList<>();

            while( resultSet.next() ){

                CategoryDto dto = new CategoryDto();
                dto.setCno( resultSet.getInt("cno") );
                dto.setCname( resultSet.getString("cname"));
                categoryDtos.add( dto );
            }

            return categoryDtos;

        }catch (Exception e){
            System.out.println(e);

        }
        return null;
    }



    // 모든글 출력
    public ArrayList<BoardDto> BoardPrint(BoardDto boardDto){
        try {
            String sql = "select * from board";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            ArrayList<BoardDto>boardDtos = new ArrayList<>();

            while ( resultSet.next() ){
                BoardDto dto = new BoardDto();
                /*dto.*/
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }




} // c e


/*public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){
        try {
            String sql ="select * from category order by cno";
            preparedStatement = connection.prepareStatement(sql);
            resultSet =  preparedStatement.executeQuery();

            ArrayList<CategoryDto>categoryDtos = new ArrayList<>();

            while( resultSet.next() ){
                CategoryDto dto = new CategoryDto();
                categoryDto.setCno( resultSet.getInt("cno") );
                categoryDto.setCname( resultSet.getString("cname"));
                categoryDtos.add( dto );
            }

            return categoryDtos;

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }*/