package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

// CONTROLLER : VIEW 와 DAO 중계역할
public class MemberController {

    // 싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){ return memberController; }

    // 1. 회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("[2] MemberController.signup");
        // 1. 유효성 검사 처리
        // 2. view에게 받은 객체를 DAO에게 전달 후 처리 결과 를 받기
        boolean result = MemberDao.getInstance().signup(memberDto);
        System.out.println("[4] result = " + result);
        return result;
    } // f e

    // + 로그인 했다는 증거 - 로그아웃을 하기전까지 [ 회원번호 또는 아이디 ]
    String loginSession = null; // null 이면 비로그인      null 대신에 아이디가 있으면 로그인



    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[2] MemberController.login");

        boolean result = MemberDao.getInstance().login( memberDto );
        System.out.println("[4] result = " + result);
        // + 만약에 로그인 성공시 로그인상태 변경
        if ( result ){
            // 로그인상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession = memberDto.getId();
        }
        return result;
    }
}
