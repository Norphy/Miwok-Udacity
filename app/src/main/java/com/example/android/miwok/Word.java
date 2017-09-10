package com.example.android.miwok;

/**
 * Created by NoraElhariri on 7/28/2017.
 * {@Link Word} represents a vocabulary that the user wants to learn.
 * It contains a default translation and a Miwok translations for that word.
 */

public class Word {

    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Private image view resource id integer variable*/
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**Private int resource id for the audio file*/
    private int mAudioResourceId;

    /**
     *
     * @param miwokTranslation miwok translation of the word to be passed into the {@Link Word}
     * @param defaultTranslation default language translation of the word to be passed into the {@Link Word}
     */
    public Word (String miwokTranslation, String defaultTranslation, int audioResourceId) {

        /** Sets Miwok word*/
        mMiwokTranslation = miwokTranslation;

        /** Sets default word*/
        mDefaultTranslation = defaultTranslation;

        /**Sets Audio resource id to the member variable*/
        mAudioResourceId = audioResourceId;

    }

    /**
     *
     * @param miwokTranslation miwok translation of the word to be passed into the {@Link Word}
     * @param defaultTranslation default language translation of the word to be passed into the {@Link Word}
     * @param imageResourceId image resource of the image to be passed into the {@Link Word} object
     */
    public Word (String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId)
    {
        /** Sets Miwok word*/
        mMiwokTranslation = miwokTranslation;

        /** Sets default word*/
        mDefaultTranslation = defaultTranslation;

        /** Sets image view id resource*/
        mImageResourceId = imageResourceId;

        /**Sets Audio resource id to the member variable*/
        mAudioResourceId = audioResourceId;

    }

    /*
    *Get Miwok translation of the word
    */
    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    /*
    *Get default translation of the word
    */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*
    *Get default translation of the word
    */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /*
    *Get the audio resource id
    */
    public int getAudioResourceId() { return mAudioResourceId;}
}
