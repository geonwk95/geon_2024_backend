package 과제.과제7;

import day12.model.MemberDto;
import day13.Step4.package2.D;
import 과제.과제6.Member;

import java.util.ArrayList;

public class Dao {

    // 싱글톤
    private Dao() {
    }

    private static Dao dao = new Dao();

    public static Dao getInstance() {
        return dao;
    }

    ArrayList<Dto> dtos = new ArrayList<>();

    // 1. 회원가입 메소드
    public boolean 회원가입(Dto dto) {
        System.out.println("[3] Dao.회원가입");
        dtos.add(dto);
        return true;

    }
// ==================================================================
    // 2. 로그인 메소드
    public  boolean 로그인(Dto dto){
        System.out.println("[3] Dao.로그인");
        for (int i = 0 ; i < dtos.size() ; i++){
            if (dtos.get(i).getId().equals( dto.getId())){
                if (dtos.get(i).getPw().equals( dto.getPw())){
                    return true;
                }
            }
        }return false;
    }
// ==================================================================
    // 3. 아이디 찾기 메소드
    public boolean 아이디찾기(Dto dto){
        System.out.println("[3] Dao.아이디찾기");
        for (int i = 0 ; i < dtos.size() ; i++){
            if (dtos.get(i).getName().equals(dto.getName())){
                if (dtos.get(i).getPhone().equals(dto.getPhone())){
                    System.out.println("찾고계신 아이디 : "+dtos.get(i).getId()+" 입니다.");
                    return true;
                }
            }
        }System.out.println("찾은 아이디가 없습니다.");
        return false;
    }

// ==================================================================
    // 4. 비밀번호 찾기 메소드
    public boolean 비밀번호찾기(Dto dto){
        System.out.println("[3] Dao.비밀번호찾기");
        for (int i = 0; i < dtos.size() ; i++) {
            if (dtos.get(i).getId().equals(dto.getId())){
                if (dtos.get(i).getPhone().equals(dto.getPhone())){
                    System.out.println("찾고계신 비밀번호 : "+dtos.get(i).getPw()+" 입니다.");
                    return true;
                }
            }
        }
        System.out.println("찾은 비밀번호가 없습니다.");
        return false;
    }






}



