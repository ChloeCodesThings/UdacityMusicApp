package com.example.macbookchlo.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Chloe", "yas", R.drawable.rubum));
        tracks.add(new Track("test", "test", R.drawable.rubum));
        tracks.add(new Track("test", "test", R.drawable.rupaul_xmas));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TrackAdapter trackAdapter = new TrackAdapter(this, tracks);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.tracklist);
        listView.setAdapter(trackAdapter);
    }
}