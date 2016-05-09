package com.example.emmancipatemusemwa.C77172238Task2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emmancipatemusemwa.task2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] movies = {"Batman vs Superman", "Captain America", "DeadPool", "Hail", "Jason", "Jungle Book", "Lane", "Xmen", "Zootopia"};

        int[] images = {R.drawable.batman_vs_superman, R.drawable.captain_america, R.drawable.deadpool,
                R.drawable.jungle_book, R.drawable.xmen,R.drawable.zootopia, R.drawable.hail,
                R.drawable.jason, R.drawable.lane};


        ListAdapter moviesAdapter = new CustomAdapter(this, movies, images);
        ListView moviesListView = (ListView) findViewById(R.id.moviesListView);
        moviesListView.setAdapter(moviesAdapter);

        moviesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        String movies = String.valueOf(parent.getItemAtPosition(position));

                        Toast.makeText(MainActivity.this, movies, Toast.LENGTH_LONG).show();
                    }
                }


        );





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
