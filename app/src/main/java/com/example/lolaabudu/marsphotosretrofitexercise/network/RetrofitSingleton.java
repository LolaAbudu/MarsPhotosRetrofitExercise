package com.example.lolaabudu.marsphotosretrofitexercise.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {
    private static Retrofit myOneInstance;

    public static Retrofit getInstance(){
        if(myOneInstance != null){
            return myOneInstance;
        }
        myOneInstance = new Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return myOneInstance;
    }
    private RetrofitSingleton(){}
}
