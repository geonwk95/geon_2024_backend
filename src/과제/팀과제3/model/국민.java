package 팀과제.팀과제3.model;

public class 국민 extends DTO{
    public String 쿠폰;

    public final String 번호;
    public 국민(String 번호,String 계좌주) {
        this.번호 ="2";
        this.계좌주=계좌주;
    }
    public 국민(String 계좌번호, String 번호, int 입금액 ){

        this.계좌번호=계좌번호;
        this.번호 = "2";
        this.입금액=입금액;
    }
}
