package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View for the Super Mario Bros. playlist
        TextView superMario = (TextView) findViewById(R.id.superMario);
        // Set an OnClickListener for the Super Mario View
        superMario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent superMarioIntent = new Intent(MainActivity.this, SuperMarioActivity.class);
                startActivity(superMarioIntent);
            }
        });

        // Find the View for the Legend of Zelda playlist
        TextView legendOfZelda = (TextView) findViewById(R.id.legendOfZelda);
        // Set an OnClickListener for the Legend of Zelda View
        legendOfZelda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zeldaIntent = new Intent(MainActivity.this, ZeldaActivity.class);
                startActivity(zeldaIntent);
            }
        });

        // Find the View for the Final Fantasy playlist
        TextView finalFantasy = (TextView) findViewById(R.id.finalFantasy);
        // Set an OnClickListener for the Final Fantasy View
        finalFantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finalFantasyIntent = new Intent(MainActivity.this, FinalFantasyActivity.class);
                startActivity(finalFantasyIntent);
            }
        });

        // Find the View for the Mega Man playlist
        TextView megaMan = (TextView) findViewById(R.id.megaMan);
        // Set an OnClickListener for the Mega Man View
        megaMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent megaManIntent = new Intent(MainActivity.this, MegaManActivity.class);
                startActivity(megaManIntent);
            }
        });
    }
}
