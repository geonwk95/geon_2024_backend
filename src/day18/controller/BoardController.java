package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardController {
    // 싱글톤
    private BoardController(){}
    private static BoardController boardController = new BoardController();
    public static BoardController getInstance(){
        return boardController;
    }


    public boolean write(BoardDto boardDto){
        boolean result = false;
        result = BoardDao.getInstance().write(boardDto);
        return result;
    }

    public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){
        ArrayList<CategoryDto> result = null;
        result = BoardDao.getInstance().categoryPrint(categoryDto);
        return result;

    }






}

/*public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){

        ArrayList<CategoryDto> result = null;
        result = BoardDao.getInstance().categoryPrint(categoryDto);
        System.out.println(result.get(1).getCname());
     return result;
    }*/