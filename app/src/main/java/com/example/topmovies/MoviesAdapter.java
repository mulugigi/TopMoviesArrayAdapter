package com.example.topmovies;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoviesAdapter extends ArrayAdapter<Movies> {

    List<Movies> mMovies;
    LayoutInflater mInflater;

    public MoviesAdapter(@NonNull Context context, @NonNull List<Movies> objects) {
        super(context, R.layout.list_item, objects);
        mMovies = objects;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            //convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
        }

        TextView txtMovieTitle = convertView.findViewById(R.id.txtMovieTitle);
        TextView txtMovieDescription = convertView.findViewById(R.id.txtMovieDescription);
        ImageView imgMovieView = convertView.findViewById(R.id.imgMovieView);

        Movies movies = mMovies.get(position);
        txtMovieTitle.setText(movies.getTitle());
        txtMovieDescription.setText(movies.getDescription());
        //imgMovieView.setImageResource(R.drawable.apple_pie);


        InputStream inputStream = null;
        try {
            String imageFile = movies.getImage();

            inputStream = getContext().getAssets().open(imageFile);
            Drawable d = Drawable.createFromStream(inputStream, null);
            imgMovieView.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return convertView;
    }
}
