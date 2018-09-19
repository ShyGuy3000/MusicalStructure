package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<MySongs> {

    /**
     * The custom ArrayAdapter is initialized, providing context from the playlist activities.
     */
    public SongAdapter(Activity context, ArrayList<MySongs> songInfo) {
        super(context, 0, songInfo);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View list_item = convertView;
        if (list_item == null) {
            list_item = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the MySongs object located at this position in the list
        MySongs currentSong = getItem(position);

        /**
         * This will find the TextView in the list_item.xml matching the song title name
         * and then set the text to the actual song name from the ArrayList MySongs object
         */
        TextView songTitleTextView = (TextView) list_item.findViewById(R.id.song_title_text_view);
        songTitleTextView.setText(currentSong.getSongTitle());

        /**
         * This will find the TextView in the list_item.xml matching the album name
         * and then set the text to the actual album name from the ArrayList MySongs object
         */
        TextView albumTitleTextView = (TextView) list_item.findViewById(R.id.album_title_text_view);
        albumTitleTextView.setText(currentSong.getAlbumName());

        /**
         * This will find the TextView in the list_item.xml matching the song play time
         * and then set the text to the actual song play time from the ArrayList MySongs object
         */
        TextView songLengthTextView = (TextView) list_item.findViewById(R.id.song_length_text_view);
        songLengthTextView.setText(currentSong.getSongLength());

        return list_item;
    }
}