package com.example.lolaabudu.marsphotosretrofitexercise.network;

import com.example.lolaabudu.marsphotosretrofitexercise.Photos;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotosServices {
    @GET("mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=DEMO_KEY")
    Call<Photos> getMarsPhotos();


}
