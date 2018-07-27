package com.example.zhuan.homesweethome;

import android.media.Image;

public class Furniture {

    private String category;
    private int thumbnail;

    public Furniture(String category, int thumbnail) {
        this.category = category;
        this.thumbnail = thumbnail;
    }

    public String getCategory() {
        return category;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
