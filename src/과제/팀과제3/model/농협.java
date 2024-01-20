package 과제.팀과제3.model;

public class 농협 extends Dto {
    public int 포인트;

    public final String 번호;
    public 농협(String 번호,String 계좌주) {
        this.번호 ="3";
        this.계좌주=계좌주;
    }
    public 농협(String 계좌번호, int 입금액, String 번호  ){
        this.계좌번호=계좌번호;
        this.번호 = "3";
        this.입금액=입금액;
    }
}
