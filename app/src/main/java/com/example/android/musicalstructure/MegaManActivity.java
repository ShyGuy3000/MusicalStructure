package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MegaManActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /**
         * Creating an ArrayList to add each song from a personal playlist
         * of Mega Man music
         */
        ArrayList<MySongs> songInfo = new ArrayList<>();

        songInfo.add(new MySongs("Searing Scissors (Cut Man Stage)", "For Everlasting Peace: 25 Years of Mega Man", "3:04"));
        songInfo.add(new MySongs("Mega Man 2: Dr. Wily Haunts Flashman", "OverClocked Remix Volume Collection", "4:06"));
        songInfo.add(new MySongs("Jungle Kuwanger (Boomer Kuwanger Stage", "For Everlasting Peace: 25 Years of Mega Man", "4:22"));
        songInfo.add(new MySongs("Air Man (Mega Man II)", "The OneUps: Volume 2", "4:01"));
        songInfo.add(new MySongs("Mega Man 2: Dr. Wily Symphonic", "OverClocked Remix Volume Collection", "2:50"));
        songInfo.add(new MySongs("Shadow Man (Mega Man III)", "The OneUps: Volume 2", "5:47"));
        songInfo.add(new MySongs("Spark Shock (Spark Man Stage)", "Mega Man: The Robot Museum", "4:50"));
        songInfo.add(new MySongs("Mega Man 2: TeknoWily", "OverClocked Remix Volume Collection", "2:39"));
        songInfo.add(new MySongs("Yamato Spear (Yamato Man Stage)", "Mega Man: The Robot Museum", "4:37"));
        songInfo.add(new MySongs("Spin Gator (Wheel Gator Stage)", "Mega Man X: Maverick Rising", "3:13"));
        songInfo.add(new MySongs("Topsy Turvy (Mega Man 3 & 5)", "Press Start: Five Years of Video Game Remixes", "2:56"));
        songInfo.add(new MySongs("Mega Man 2: Wily Meets Flash Man", "OverClocked Remix Volume Collection", "4:12"));
        songInfo.add(new MySongs("Cement Extacy (Mega Man 9)", "Press Start: Five Years of Video Game Remixes", "2:29"));
        songInfo.add(new MySongs("Standing on Top (Mega Man 3 & 4)", "Press Start: Five Years of Video Game Remixes", "4:02"));
        songInfo.add(new MySongs("Mega Man 2: Chill Out", "OverClocked Remix Volume Collection", "5:14"));

        // Create the ArrayAdapter to pass in the ArrayList created above
        SongAdapter myPlaylistAdapter = new SongAdapter(this, songInfo);

        // Find the ListView which is declared in song_list.xml to create an object
        ListView songListView = (ListView) findViewById(R.id.song_list);

        // Make the ListView use the ArrayAdapter to populate all of the songInfo objects
        songListView.setAdapter(myPlaylistAdapter);

    }
}
