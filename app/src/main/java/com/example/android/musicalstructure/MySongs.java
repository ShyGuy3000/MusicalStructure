package com.example.android.musicalstructure;

public class MySongs {

    /**
     * String variable for receiving the song title
     */
    private String mSongTitle;

    /**
     * String variable for receiving the album title
     */
    private String mAlbumName;

    /**
     * String variable for receiving the total play time for the song
     */
    private String mSongLength;

    /**
     * Create the new MySongs object
     */

    public MySongs(String songTitle, String albumName, String songLength){
        mSongTitle = songTitle;
        mAlbumName = albumName;
        mSongLength = songLength;
    }

    /**
     * Get the title for the song.
     */
    public String getSongTitle(){
        return mSongTitle;
    }

    /**
     * Get the album name for the song (this sometimes includes the artist name).
     */
    public String getAlbumName(){
        return mAlbumName;
    }

    /**
     * Get the play time for the song in minutes and seconds.
     */

    public String getSongLength(){
        return mSongLength;
    }
}
