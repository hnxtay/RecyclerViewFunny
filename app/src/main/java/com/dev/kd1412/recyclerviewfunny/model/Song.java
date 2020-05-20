package com.dev.kd1412.recyclerviewfunny.model;

public class Song {
    private String mAvt;
    private String mSongname;
    private String mSinger;

    public Song(String mAvt, String mSongname, String mSinger) {
        this.mAvt = mAvt;
        this.mSongname = mSongname;
        this.mSinger = mSinger;
    }

    public String getmAvt() {
        return mAvt;
    }

    public void setmAvt(String mAvt) {
        this.mAvt = mAvt;
    }

    public String getmSongname() {
        return mSongname;
    }

    public void setmSongname(String mSongname) {
        this.mSongname = mSongname;
    }

    public String getmSinger() {
        return mSinger;
    }

    public void setmSinger(String mSinger) {
        this.mSinger = mSinger;
    }
}
