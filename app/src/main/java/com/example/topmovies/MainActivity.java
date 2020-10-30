package com.example.topmovies;

import android.os.Bundle;
import android.widget.ListView;

import com.example.topmovies.Sample.SampleDataProvider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final List<Movies> dataItemList = SampleDataProvider.dataItemList;
   // private final List<String> movieNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Collections.sort(dataItemList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

/*
        //This is used to test our Movies class by creating a new movie object
        Movies movies = new Movies(null, "The bodyguard", "This is action film");
        txtMovies = findViewById(R.id.txtMovies);
        txtMovies.setText(movies.toString());
        txtMovies.setText(String.format("%s \t %s", movies.getTitle(), movies.getDescription()));

        TextView txtMovies = findViewById(R.id.txtMovies);
        txtMovies.setText("");

        Collections.sort(dataItemList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for(Movies movie : dataItemList){
            txtMovies.append(String.format("%s \t %s \t %s \n", movie.getId(), movie.getTitle(), movie.getDescription()));
        }
 */
/*        for(Movies movie : dataItemList){
            //txtMovies.append(String.format("%s \t %s \t %s \n", movie.getId(), movie.getTitle(), movie.getDescription()));
            movieNames.add(movie.getTitle() + movie.getDescription());
        }
        Collections.sort(movieNames);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, movieNames);
        ListView listView = findViewById(R.id.lstMovies);
        listView.setAdapter(adapter);
    }
     */

        MoviesAdapter adapter = new MoviesAdapter(this, dataItemList);
        ListView listView = findViewById(R.id.lstMovies);
        listView.setAdapter(adapter);
    }
}