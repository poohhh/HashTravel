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
    private String hashTag;
    private int views;


    static class Place {
        private String name; // 여행지 이름
        private String desc; // 여행지 설명
        private float rating; // 여행지 별점 점수
        private int photoId; // 여행지 사진 리소스 아이디

        public Place(String name, String desc, float rating, int photoId) {
            this.name = name;
            this.desc = desc;
            this.rating = rating;
            this.photoId = photoId;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public float getRating() {
            return rating;
        }

        public int getPhotoId() {
            return photoId;
        }
    }



}
