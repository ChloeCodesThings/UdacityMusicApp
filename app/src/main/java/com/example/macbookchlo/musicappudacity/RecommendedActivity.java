package com.example.macbookchlo.musicappudacity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import java.util.ArrayList;


public class RecommendedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);

        // Create an ArrayList of track objects
        final ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Kiki & Herb Will Die for You", "Kiki & Herb", R.drawable.kikiherb));
        tracks.add(new Track("Under the Covers", "Courtney Act", R.drawable.under));
        tracks.add(new Track("Your Makeup Is Terrible", "Alaska", R.drawable.makeup));

        // Create a TrackAdapter, whose data source is a list of
        // TrackAdapters. The adapter knows how to create list item views for each item
        // in the list.
        TrackAdapter trackAdapter = new TrackAdapter(this, tracks);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.tracklist);
        listView.setAdapter(trackAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Track track = tracks.get(position);

                NowPlayingActivity.startNowPlaying(RecommendedActivity.this,
                        track.getTitle(), track.getArtist(), track.getImageResourceId());
            }
        });
    }
}