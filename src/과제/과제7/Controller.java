package 과제.과제7;

public class Controller {

    public static boolean 회원가입(Dto dto){
        System.out.println("[2] Controller.회원가입");
        boolean result = Dao.getInstance().회원가입(dto);
        System.out.println("[4] result = " + result);
        return result;
    }

    public  static boolean 로그인(Dto dto){
        System.out.println("[2] Controller.로그인");
        boolean result = Dao.getInstance().로그인(dto);
        System.out.println("[4] result = " + result);
        return result;
    }

    public  static  boolean 아이디찾기(Dto dto){
        System.out.println("[2] Controller.아이디찾기");
        boolean result = Dao.getInstance().아이디찾기(dto);
        System.out.println("[4] result = " + result);
        return result;
    }


    public  static  boolean 비밀번호찾기(Dto dto){
        System.out.println("[2] Controller.비밀번호찾기");
        boolean result = Dao.getInstance().비밀번호찾기(dto);
        return result;
    }
}