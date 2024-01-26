package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dao.MemberDao;
import day18.model.dto.BoardDto;

import java.util.Scanner;

public class WriteView {
    //싱글톤
    private WriteView(){};
    private static WriteView writeView = new WriteView();
    public static WriteView getInstance(){return writeView;}
    //입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 1. 글쓰기
    public void write(){
        System.out.println("카테고리 선택");
        System.out.println("1.JAVA 2.C언어");
        System.out.println("선택>");
        int category = scanner.nextInt();

        System.out.println("제목을 써주세요"); String title = scanner.next();
        System.out.println("내용을 적어주세요"); String content = scanner.next();
        int mno = MemberController.getInstance().loginMno;

        BoardDto boardDto = new BoardDto(mno,category,title,content);

        boolean result = BoardController.getInstance().write(boardDto);
        if(result){
            System.out.println("등록완료");
        }else {
            System.out.println("등록실패");
        }
    }
}