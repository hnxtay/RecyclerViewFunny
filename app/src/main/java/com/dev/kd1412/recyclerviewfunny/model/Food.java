package com.dev.kd1412.recyclerviewfunny.model;

public class Food {
    private String mImage;
    private String mTittle;

    public Food(String mImage, String mTittle) {
        this.mImage = mImage;
        this.mTittle = mTittle;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String mImage) {
        this.mImage = mImage;
    }

    public String getTittle() {
        return mTittle;
    }

    public void setTittle(String mTittle) {
        this.mTittle = mTittle;
    }
}
