package com.example.zhuan.homesweethome;

public class IndividualFurniture {

    private String category;
    private String title;
    private String description;
    private int thumbnail;

    public IndividualFurniture(String title, String category, String description, int thumbnail) {
        this.category = category;
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String gettitle () {return title;}

    public String getdescription () {return description;}

    public int getThumbnail() {
        return thumbnail;
    }

    public void settitle(String title){this.title = title;}

    public void setdescription(String description) {this.description = description;}

    public void setCategory(String category) {
        this.category = category;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
