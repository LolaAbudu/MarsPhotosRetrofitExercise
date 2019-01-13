package com.example.lolaabudu.marsphotosretrofitexercise;

public class Photos {
    private int id;
    private int sol;
    private MyCamera camera;
    private String img_src;
    private String earth_date;
    private Rover rover;

    public Photos(String img_src, String earth_date){
        this.img_src=img_src;
        this.earth_date=earth_date;
    }

    public int getId() {
        return id;
    }

    public int getSol() {
        return sol;
    }

    public MyCamera getCamera() {
        return camera;
    }

    public String getImg_src() {
        return img_src;
    }

    public String getEarth_date() {
        return earth_date;
    }

    public Rover getRover() {
        return rover;
    }
}
