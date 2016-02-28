package com.edileusondias.traktseries.model;

/**
 * Created by Eddy on 2/26/2016.
 */
public class Series {
    private String title;
    private int year;
    private Images images;

    public Series(String title, int year, Images images) {
        this.title = title;
        this.year = year;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }
}
