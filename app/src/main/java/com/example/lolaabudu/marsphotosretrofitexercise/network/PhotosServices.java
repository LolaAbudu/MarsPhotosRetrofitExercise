package com.example.lolaabudu.marsphotosretrofitexercise.network;

import android.util.Log;

import com.example.lolaabudu.marsphotosretrofitexercise.PhotosImages;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PhotosServices {
    @GET("mars-photos/api/v1/rovers/curiosity/photos")
    Call<PhotosImages> getMarsPhotos(@Query("sol")int one, @Query("api_key")String demo_key);

    //?sol=1&api_key=DEMO_KEY
}
