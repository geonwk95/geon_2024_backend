package day18.model.dto;

public class BoardDto {


        //1.필드
        private int mno;
        private int cno;
        private int bno;
        private String btitle;
        private String bcontent;
        private String bdate;
        private int bview;




        public BoardDto(){};

        public BoardDto(int mno, int cno, int bno, String btitle, String bcontent, String bdate, int bview) {
            this.mno = mno;
            this.cno = cno;
            this.bno = bno;
            this.btitle = btitle;
            this.bcontent = bcontent;
            this.bdate = bdate;
            this.bview = bview;

        }

        public BoardDto(int mno , int cno, String btitle, String bcontent) {
            this.mno = mno;
            this.cno = cno;
            this.btitle = btitle;
            this.bcontent = bcontent;
        }

        public int getMno() {
            return mno;
        }

        public void setMno(int mno) {
            this.mno = mno;
        }

        public int getCno() {
            return cno;
        }

        public void setCno(int cno) {
            this.cno = cno;
        }

        public int getBno() {
            return bno;
        }

        public void setBno(int bno) {
            this.bno = bno;
        }

        public String getBtitle() {
            return btitle;
        }

        public void setBtitle(String btitle) {
            this.btitle = btitle;
        }

        public String getBcontent() {
            return bcontent;
        }

        public void setBcontent(String bcontent) {
            this.bcontent = bcontent;
        }

        public String getBdate(String bdate) {
            return this.bdate;
        }

        public void setBdate(String bdate) {
            this.bdate = bdate;
        }

        public int getBview() {
            return bview;
        }

        public void setBview(int bview) {
            this.bview = bview;
        }


}

