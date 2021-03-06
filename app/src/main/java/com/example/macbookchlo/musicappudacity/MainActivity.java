package com.example.macbookchlo.musicappudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Button albums;
        albums = findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                startActivity(albumsIntent);
            }
        });

        Button podcasts;
        podcasts = findViewById(R.id.podcasts);

        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                startActivity(podcastsIntent);
            }
        });

        Button discover;
        discover = findViewById(R.id.discover);

        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);

                startActivity(discoverIntent);
            }
        });

        Button recommended;
        discover = findViewById(R.id.recommended);

        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendedIntent = new Intent(MainActivity.this, RecommendedActivity.class);

                startActivity(recommendedIntent);
            }
        });

    }
}
