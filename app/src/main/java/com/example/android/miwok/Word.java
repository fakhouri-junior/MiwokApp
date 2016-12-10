package com.example.android.miwok;

/**
 * Created by salim on 09/10/2016.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String mDefault, String mMiwok, int mAudioResourceID){

        this.mDefaultTranslation = mDefault;
        this.mMiwokTranslation = mMiwok;
        this.mAudioResourceID = mAudioResourceID;
    }

    public Word(String mDefault, String mMiwok, int resourceID, int mAudioResourceID){

        this.mDefaultTranslation = mDefault;
        this.mMiwokTranslation = mMiwok;
        this.mImageResourceID = resourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmAudioResourceID(){
        return mAudioResourceID;
    }

    public int getImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }


    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceID +
                ", mImageResourceId=" + mImageResourceID +
                '}';
    }
}
