package edu.android.hashtravel;


public class DashBoard {

    // Model Class
//    public class Continent {
//        private String name;
//        private String desc;
//
//        public class Country {
//            private String name;
//            private String location;
//            private String desc;
//            private String etc;
//            public class Place {
//                private String name;
//                private String ratting;
//    }
//        }
//    }
    private int articleNo;
    private String[] continent;
    private String[] contry;
    private String subject;
    private String description;
    private String author;

    public DashBoard(String[] continent, String[] contry, String subject, String description, String author) {

        this.continent = continent;
        this.contry = contry;
        this.subject = subject;
        this.description = description;
        this.author = author;
    }

    public int getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(int articleNo) {
        this.articleNo = articleNo;
    }

    public String[] getContinent() {
        return continent;
    }

    public void setContinent(String[] continent) {
        this.continent = continent;
    }

    public String[] getContry() {
        return contry;
    }

    public void setContry(String[] contry) {
        this.contry = contry;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
