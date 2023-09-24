package com.example.ourheritage;

public class upload {
    private String mName;
    private String mImageUrl;

    public upload(){

    }
    public upload(String name, String imageUrl){
        if(name.trim().equals("")){
            name = "no name";
        }

        mName = name;
        mImageUrl = imageUrl;
    }

    public String getmName() {
        return mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
