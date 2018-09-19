package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SuperMarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /**
         * Creating an ArrayList to add each song from a personal playlist
         * of Super Mario Bros. music
         */
        ArrayList<MySongs> songInfo = new ArrayList<>();

        songInfo.add(new MySongs("Super Mario World: Turning Terrors", "OverClocked Remix Volume Collection", "4:00"));
        songInfo.add(new MySongs("Super Mario Bros. 2: Underground Riddims", "OverClocked Remix Volume Collection", "2:41"));
        songInfo.add(new MySongs("Super Mario Bros. 3: Aquacadence", "OverClocked Remix Volume Collection", "4:36"));
        songInfo.add(new MySongs("Super Mario Bros. 3: Of Mind and Body", "OverClocked Remix Volume Collection", "2:05"));
        songInfo.add(new MySongs("Super Mario Bros.: 8-bit Eighties", "OverClocked Remix Volume Collection", "3:50"));
        songInfo.add(new MySongs("Super Mario Bros.: Dancehall Ragga", "OverClocked Remix Volume Collection", "2:33"));
        songInfo.add(new MySongs("Super Mario Bros.: Mario Likes Thorazine", "OverClocked Remix Volume Collection", "4:14"));
        songInfo.add(new MySongs("The Third Dimension (Title Theme)", "Super Mario 64: Portrait of a Plumber", "4:11"));
        songInfo.add(new MySongs("Wings to the Sky (Powerful Mario)", "Super Mario 64: Portrait of a Plumber", "3:00"));
        songInfo.add(new MySongs("Perilous Pathway (Koopa's Road)", "Super Mario 64: Portrait of a Plumber", "4:14"));
        songInfo.add(new MySongs("Mario 64", "Entertainment System - Rock n' Roll Cereal", "2:48"));
        songInfo.add(new MySongs("Ba Dop-A-Doop", "Entertainment System - Rock n' Roll Cereal", "6:52"));
        songInfo.add(new MySongs("Bloop Bloop", "Entertainment System -  Rock n' Roll Cereal", "4:37"));
        songInfo.add(new MySongs("Mario Haunted", "Entertainment System - Rock n' Roll Cereal", "3:51"));
        songInfo.add(new MySongs("Super Medley", "Entertainment System - Rock n' Roll Cereal", "4:05"));
        songInfo.add(new MySongs("Fortress of Doom (Koopalings)", "BadAss: Boss Themes: Volume III", "4:16"));
        songInfo.add(new MySongs("Super Mario World: Athletic", "Super Guitar Bros. - Nice.", "1:40"));

        // Create the ArrayAdapter to pass in the ArrayList created above
        SongAdapter myPlaylistAdapter = new SongAdapter(this, songInfo);

        // Find the ListView which is declared in song_list.xml to create an object
        ListView songListView = (ListView) findViewById(R.id.song_list);

        // Make the ListView use the ArrayAdapter to populate all of the songInfo objects
        songListView.setAdapter(myPlaylistAdapter);

    }
}
