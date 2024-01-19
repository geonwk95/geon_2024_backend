package 팀과제.팀과제3.model;

public class 신한 extends DTO {
    public int 마일리지;

    public final String 번호 ;
    public 신한(String 번호,String 계좌주) {
        this.번호 ="1";
        this.계좌주=계좌주;
    }
    public 신한(String 계좌번호, String 번호, int 입금액 ){
        this.번호 = 번호;
        this.계좌번호=계좌번호;
        this.입금액=입금액;
    }
}
