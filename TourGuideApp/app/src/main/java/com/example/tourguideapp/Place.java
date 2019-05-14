package com.example.tourguideapp;

/**
 * {@link Place} represents a information about the place that the user wants to know.
 * It contains a images resource id , a name of the place and paragraph about the place .
 */

public class Place {

    /**
     * Name of the place
     */
    private String mName;

    /**
     * image resource id
     */
    private int mImageResourceId;
    /**
     * paragraph about the place
     */
    private String mParagraph;

    /**
     * Create a new Place object.
     *
     * @param name            is the name of the place
     * @param imageResourceId is image of the place
     * @param paragraph       is a paragraph about the place
     */
    public Place(String name, int imageResourceId, String paragraph) {
        mName = name;
        mImageResourceId = imageResourceId;
        mParagraph = paragraph;

    }

    /**
     * Get the name of the place
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the image resource id of the place
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the paragraph about the place
     */
    public String getParagraph() {
        return mParagraph;
    }

}
