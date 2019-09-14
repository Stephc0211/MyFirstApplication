package com.example.myfirstapplication.bean;

import android.view.TextureView;

public class TutorialItem {

    public TutorialItem(){}

    private int mTutorialVideo;

    private int mTutorialPicUrl;

    private String mTutorialIntro;

    public int getmTutorialVideo() {
        return mTutorialVideo;
    }

    public void setmTutorialVideo(int mTutorialVideo) {
        this.mTutorialVideo = mTutorialVideo;
    }

    public int getmTutorialPicUrl() {
        return mTutorialPicUrl;
    }

    public void setmTutorialPicUrl(int mTutorialPicUrl) {
        this.mTutorialPicUrl = mTutorialPicUrl;
    }

    public String getmTutorialIntro() {
        return mTutorialIntro;
    }

    public void setmTutorialIntro(String mTutorialIntro) {
        this.mTutorialIntro = mTutorialIntro;
    }
}
