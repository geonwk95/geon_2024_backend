package day18.model.dao;

public class BoardDao extends Dao {

    // 싱글톤
    private  BoardDao(){}
    private static BoardDao boardDao = new BoardDao();

    public static BoardDao getInstance(){
        return boardDao;
    }





} // c e
