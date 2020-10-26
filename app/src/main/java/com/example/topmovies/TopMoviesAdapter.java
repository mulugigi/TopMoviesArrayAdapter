package com.example.topmovies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopMoviesAdapter extends RecyclerView.Adapter<TopMoviesHolder> {
    @NonNull
    @Override
    public TopMoviesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new TopMoviesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopMoviesHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
