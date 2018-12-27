package com.example.macbookchlo.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcasts);

        // Create an ArrayList of AndroidFlavor objects
        final ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("What's the Tee?", "Rupaul + Michelle Visage", R.drawable.rubum));
        tracks.add(new Track("What the Tuck?", "Nicole Byer + Joel Kim Booster", R.drawable.rubum));
        tracks.add(new Track("Las Culturistas", "Matt Rodgers + Bowen Yang", R.drawable.rubum));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TrackAdapter trackAdapter = new TrackAdapter(this, tracks);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.tracklist);
        listView.setAdapter(trackAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Track track = tracks.get(position);

                NowPlayingActivity.startNowPlaying(PodcastsActivity.this,
                        track.getTitle(), track.getArtist(), track.getImageResourceId());
            }
        });
    }
}

