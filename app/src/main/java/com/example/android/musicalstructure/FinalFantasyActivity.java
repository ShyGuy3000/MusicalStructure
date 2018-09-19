package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FinalFantasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /**
         * Creating an ArrayList to add each song from a personal playlist
         * of Final Fantasy music
         */
        ArrayList<MySongs> songInfo = new ArrayList<>();

        songInfo.add(new MySongs("Battle Scene (Final Fantasy I)", "The Black Mages", "4:19"));
        songInfo.add(new MySongs("Main Theme of Final Fantasy VII", "Final Fantasy VII Piano Collections", "4:27"));
        songInfo.add(new MySongs("Full of Courage (The Red Wings)", "Final Fantasy IV: Echoes of Betrayal, Light of Redemption", "4:46"));
        songInfo.add(new MySongs("Aeris's Theme", "Final Fantasy VII Piano Collections", "4:06"));
        songInfo.add(new MySongs("Final Fantasy", "Super Guitar Bros.", "6:43"));
        songInfo.add(new MySongs("The Man with the Machine Gun (Final Fantasy VIII)", "The Black Mages", "4:16"));
        songInfo.add(new MySongs("The Decisive Battle (Final Fantasy VI)", "The Black Mages", "4:02"));
        songInfo.add(new MySongs("Crazy Motorcycle", "Final Fantasy VII Reunion Tracks", "3:37"));
        songInfo.add(new MySongs("Fighting", "Final Fantasy VII Piano Collections", "3:57"));
        songInfo.add(new MySongs("Survival Instincts (Battle 2)", "Final Fantasy IV: Echoes of Betrayal, Light of Redemption", "4:03"));
        songInfo.add(new MySongs("Clash on the Big Bridge (Final Fantasy V)", "The Black Mages", "4:16"));
        songInfo.add(new MySongs("Ba Dop-A-Doop", "Final Fantasy VII Reunion Tracks", "4:26"));

        // Create the ArrayAdapter to pass in the ArrayList created above
        SongAdapter myPlaylistAdapter = new SongAdapter(this, songInfo);

        // Find the ListView which is declared in song_list.xml to create an object
        ListView songListView = (ListView) findViewById(R.id.song_list);

        // Make the ListView use the ArrayAdapter to populate all of the songInfo objects
        songListView.setAdapter(myPlaylistAdapter);

    }
}
