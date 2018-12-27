package com.example.macbookchlo.musicappudacity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class NowPlayingActivity extends AppCompatActivity {

    public static String TRACK = "track";
    public static String ARTIST = "artist";
    public static String ALBUM_RES = "album_res";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        //Get Intent that started activity
        Intent intent = getIntent();

        //Get track info
        String track = intent.getStringExtra(TRACK);
        String artist = intent.getStringExtra(ARTIST);
        int albumRes = intent.getIntExtra(ALBUM_RES, 0);

        //Get Views from XML
        ImageView albumArtView = findViewById(R.id.album_art);
        TextView trackView = findViewById(R.id.track_name);
        TextView artistView = findViewById(R.id.artist_name);


        //Set track info on views
        albumArtView.setImageResource(albumRes);
        trackView.setText(track);
        artistView.setText(artist);

    }

    /**
     * Starts {@link NowPlayingActivity} with required track information
     *
     * @param context
     * @param track
     * @param artist
     * @param albumRes
     */
    public static void startNowPlaying(Context context, String track, String artist, int albumRes) {
        Intent intent = new Intent(context, NowPlayingActivity.class);
        intent.putExtra(TRACK, track);
        intent.putExtra(ARTIST, artist);
        intent.putExtra(ALBUM_RES, albumRes);
        context.startActivity(intent);

    }

}
