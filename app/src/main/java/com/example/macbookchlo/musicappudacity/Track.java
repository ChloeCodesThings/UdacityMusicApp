package com.example.macbookchlo.musicappudacity;

public class Track {

    // Title of the Track
    private String mTitle;

    // Artist name
    private String mArtist;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param tTitle is the name of the Track
     * @param tArtist is the artist(s)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Track(String tTitle, String tArtist, int imageResourceId)
    {
        mTitle = tTitle;
        mArtist = tArtist;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the Android version number
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}

