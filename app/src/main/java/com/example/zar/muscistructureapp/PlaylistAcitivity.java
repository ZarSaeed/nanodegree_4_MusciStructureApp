package com.example.zar.muscistructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistAcitivity extends AppCompatActivity {
    Button artist,album,genre,play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_acitivity);
        intiComponent();
        setClickListners();
    }

    private  void intiComponent()
    {
        artist = (Button) findViewById(R.id.button_artist);
        album= (Button) findViewById(R.id.button_album);
        genre= (Button) findViewById(R.id.button_genre);
        play= (Button) findViewById(R.id.button_playlist);

    }


    private void setClickListners()
    {

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentArtist=new Intent(v.getContext(),ArtistActivity.class);
                startActivity(intentArtist);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentPlay=new Intent(v.getContext(),PlaylistAcitivity.class);
                startActivity(intentPlay);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentAlbum=new Intent(v.getContext(),AlbumActivity.class);
                startActivity(intentAlbum);
            }
        });
        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentGenre=new Intent(v.getContext(),GenreActivity.class);
                startActivity(intentGenre);
            }
        });

    }
}
