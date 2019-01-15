package com.example.lolaabudu.marsphotosretrofitexercise.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lolaabudu.marsphotosretrofitexercise.Photos;
import com.example.lolaabudu.marsphotosretrofitexercise.R;
import com.squareup.picasso.Picasso;

public class PhotoViewHolder extends RecyclerView.ViewHolder {
    private ImageView img_srcImageView;
    private TextView earth_dateTextView;

    public PhotoViewHolder(@NonNull View itemView) {
        super(itemView);
        img_srcImageView = itemView.findViewById(R.id.img_src_imageView);
        earth_dateTextView = itemView.findViewById(R.id.earth_date_textView);

    }

    public void onBind(Photos photos){
        earth_dateTextView.setText(photos.getEarth_date());
        Picasso.get()
                .load("https" + photos.getImg_src().substring(4))
                .into(img_srcImageView);
    }
}
