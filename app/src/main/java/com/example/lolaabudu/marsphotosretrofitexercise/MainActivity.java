package com.example.lolaabudu.marsphotosretrofitexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.lolaabudu.marsphotosretrofitexercise.controller.PhotoAdapter;
import com.example.lolaabudu.marsphotosretrofitexercise.network.PhotosServices;
import com.example.lolaabudu.marsphotosretrofitexercise.network.RetrofitSingleton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PhotoAdapter photoAdapter;
    private final String TAG = "photos_all";
    final String api_key = "DEMO_KEY";
    final List<Photos> allPhotosList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.photo_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        Retrofit retrofit = RetrofitSingleton.getInstance();

        PhotosServices photosServices = retrofit.create(PhotosServices.class);

        Call<PhotosImages> onePhoto = photosServices.getMarsPhotos(1, api_key);

        onePhoto.enqueue(new Callback<PhotosImages>() {
            @Override
            public void onResponse(Call<PhotosImages> call, Response<PhotosImages> response) {

                PhotosImages photosImages = response.body();

                Log.d(TAG,"onResponse: " + response.body().getImgSrc().get(0).getEarth_date());

                if(photosImages != null) {
                    for (Photos s : photosImages.getImgSrc()) {
                        allPhotosList.add(s);

                        //Log.d(TAG, "onCreate" + allPhotosList.size());
                        Log.d(TAG, "onCreate" + s.getImg_src());
                        Log.d(TAG, "onCreate" + s.getEarth_date());
                    }
                }

                photoAdapter = new PhotoAdapter(allPhotosList);
                recyclerView.setAdapter(photoAdapter);

                //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false));

                Log.d(TAG,"onResponse: " + allPhotosList.size());

            }

            @Override
            public void onFailure(Call<PhotosImages> call, Throwable t) {
                Log.d(TAG, "onFailure" + t.toString());
            }
        });
    }
}
