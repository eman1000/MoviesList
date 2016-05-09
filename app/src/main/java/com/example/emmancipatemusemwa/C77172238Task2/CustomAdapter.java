package com.example.emmancipatemusemwa.C77172238Task2;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emmancipatemusemwa.task2.R;

/**
 * Created by emmancipatemusemwa on 09/05/16.
 */
class CustomAdapter extends ArrayAdapter<String> {

    int[] images;
    CustomAdapter(Context context, String[] movies, int[] images) {
        super(context, R.layout.custom_layout, movies);
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater moviesInflater = LayoutInflater.from(getContext());
        View customView = moviesInflater.inflate(R.layout.custom_layout, parent, false);

        String singleMovieItem = getItem(position);
        TextView movieTitle = (TextView) customView.findViewById(R.id.movieTitle);
        Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(),  "fonts/teen.ttf");
        movieTitle.setTypeface(custom_font);
        ImageView movieImage = (ImageView) customView.findViewById(R.id.movieImage);

        movieTitle.setText(singleMovieItem);
        movieImage.setImageResource(images[position]);
        return customView;


    }


}
