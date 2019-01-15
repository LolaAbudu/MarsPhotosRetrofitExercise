package com.example.lolaabudu.marsphotosretrofitexercise;

import java.util.List;

public class PhotosImages {

    //the name photo has to be the exact same as the JSON schema
    private List<Photos> photos;

    public List<Photos> getImgSrc(){
        return photos;
    }

    public void setPhotos(List<Photos> photos) {
        this.photos = photos;
    }
}
