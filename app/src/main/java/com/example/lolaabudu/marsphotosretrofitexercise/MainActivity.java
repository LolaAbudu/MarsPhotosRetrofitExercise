package com.example.lolaabudu.marsphotosretrofitexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lolaabudu.marsphotosretrofitexercise.network.PhotosServices;
import com.example.lolaabudu.marsphotosretrofitexercise.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "photos_all";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = RetrofitSingleton.getInstance();

        PhotosServices photosServices = retrofit.create(PhotosServices.class);

        Call<Photos> onePhoto = photosServices.getMarsPhotos();

        onePhoto.enqueue(new Callback<Photos>() {
            @Override
            public void onResponse(Call<Photos> call, Response<Photos> response) {
                Log.d(TAG,"onResponse: " + response.body().getImg_src());
                Log.d(TAG,"onResponse: " + response.body().getEarth_date());
            }

            @Override
            public void onFailure(Call<Photos> call, Throwable t) {
                Log.d(TAG, "onFailure" + t.toString());
            }
        });
    }
}
