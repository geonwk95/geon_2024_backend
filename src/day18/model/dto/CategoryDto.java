package day18.model.dto;

public class CategoryDto {
    int cno;
    String cname;


    public CategoryDto(){}
    public CategoryDto(int cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
