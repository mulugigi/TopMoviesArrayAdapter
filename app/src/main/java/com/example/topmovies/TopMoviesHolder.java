package com.example.topmovies;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopMoviesHolder extends RecyclerView.ViewHolder {
    private final TextView textview;

    public TopMoviesHolder(@NonNull View itemView) {
        super(itemView);
        textview = (TextView) itemView;
    }
}
