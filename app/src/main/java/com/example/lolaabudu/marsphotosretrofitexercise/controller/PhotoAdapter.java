package com.example.lolaabudu.marsphotosretrofitexercise.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lolaabudu.marsphotosretrofitexercise.Photos;
import com.example.lolaabudu.marsphotosretrofitexercise.R;
import com.example.lolaabudu.marsphotosretrofitexercise.view.PhotoViewHolder;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {

    private List<Photos> myMarsPhotos;

    public PhotoAdapter(List<Photos> myMarsPhotos){
        this.myMarsPhotos=myMarsPhotos;
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_itemview, parent, false);
        return new PhotoViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder photoViewHolder, int position) {
        Photos photos =myMarsPhotos.get(position);
        photoViewHolder.onBind(photos);
    }

    @Override
    public int getItemCount() {
        return myMarsPhotos.size();
    }
}
