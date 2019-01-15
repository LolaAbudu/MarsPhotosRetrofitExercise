package com.example.lolaabudu.marsphotosretrofitexercise;

public class Photos {
    private int id;
    private int sol;
    private MyCamera camera;
    private String img_src;
    private String earth_date;
    private Rover rover;

//    public Photos(String img_src, String earth_date){
//        this.img_src=img_src;
//        this.earth_date=earth_date;
//    }


    public String getImg_src() {
        return img_src;
    }

    public String getEarth_date() {
        return earth_date;
    }

    public void setImg_src(String img_src){
        this.img_src=img_src;
    }

    public void setEarth_date(String earth_date){
        this.earth_date=earth_date;
    }
}
