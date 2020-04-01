package com.example.javatask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.navigate);
        navigationView.setItemIconTintList(null);

        ArrayList<Details> details = new ArrayList<>();

        details.add(new Details("Learning something new","like"));
        details.add(new Details("Watching movies","like"));
        details.add(new Details("Surfing the internet","like"));
        details.add(new Details("Trying out new tech","like"));
        details.add(new Details("Cooking","like"));

        details.add(new Details("Coding","hobby"));
        details.add(new Details("Playing Video games","hobby"));
        details.add(new Details("Researching","hobby"));

        details.add(new Details("Laziness","dislike"));
        details.add(new Details("Bullying","dislike"));
        details.add(new Details("Poor internet connection","dislike"));

        ListView listView = findViewById(R.id.list_view);
        DetailsAdapter detailsAdapter = new DetailsAdapter(this,details);
        listView.setAdapter(detailsAdapter);

    }
}
