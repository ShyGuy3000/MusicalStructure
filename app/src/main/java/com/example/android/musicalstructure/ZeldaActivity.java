package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ZeldaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /**
         * Creating an ArrayList to add each song from a personal playlist
         * of Legend of Zelda music
         */
        ArrayList<MySongs> songInfo = new ArrayList<>();

        songInfo.add(new MySongs("Rockarina of Time", "Entertainment System - Rock n' Roll Cereal", "4:27"));
        songInfo.add(new MySongs("Lucidic (Koholint Island)", "Link's Awakening: Threshold of a Dream", "3:23"));
        songInfo.add(new MySongs("Threshold of a Dream (Title)", "Link's Awakening: Threshold of a Dream", "3:15"));
        songInfo.add(new MySongs("The Fate of Hyrule is in Your Hands", "Entertainment System - Rock n' Roll Cereal", "4:13"));
        songInfo.add(new MySongs("Village from Your Past (Ocarina of Time)", "25YEARLEGEND", "3:31"));
        songInfo.add(new MySongs("Ballad of the Wind Fish (Link's Awakening)", "25YEARLEGEND", "4:28"));
        songInfo.add(new MySongs("Chamber of the Goddess (A Link to the Past)", "25YEARLEGEND", "3:03"));
        songInfo.add(new MySongs("Gimme My Sword!", "25YEARLEGEND", "4:53"));
        songInfo.add(new MySongs("Zelda 2: Palace Theme Remix", "Plasma3 Remixes", "3:30"));
        songInfo.add(new MySongs("Link's Awakening: Mountain of Dreams", "OverClocked Remix Volume Collection", "4:36"));

        // Create the ArrayAdapter to pass in the ArrayList created above
        SongAdapter myPlaylistAdapter = new SongAdapter(this, songInfo);

        // Find the ListView which is declared in song_list.xml to create an object
        ListView songListView = (ListView) findViewById(R.id.song_list);

        // Make the ListView use the ArrayAdapter to populate all of the songInfo objects
        songListView.setAdapter(myPlaylistAdapter);

    }
}



