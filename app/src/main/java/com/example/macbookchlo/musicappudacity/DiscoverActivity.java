package com.example.macbookchlo.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        // Create an ArrayList of Track objects
        final ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Two Birds", "Trixie Mattel", R.drawable.twobirds));
        tracks.add(new Track("Till Death Do Us Party", "Adore Delano", R.drawable.tilldeath));
        tracks.add(new Track("Coffee & Wine", "Jinkx Monsoon", R.drawable.coffeewine));

        // Create a TrackAdapter, whose data source is a list of
        //  TrackAdapters. The adapter knows how to create list item views for each item
        // in the list.
        TrackAdapter trackAdapter = new TrackAdapter(this, tracks);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.tracklist);
        listView.setAdapter(trackAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Track track = tracks.get(position);

                NowPlayingActivity.startNowPlaying(DiscoverActivity.this,
                        track.getTitle(), track.getArtist(), track.getImageResourceId());
            }
        });
    }
}