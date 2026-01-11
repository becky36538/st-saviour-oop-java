package oop;

public abstract class Art {
    private String title; {
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public String display() {
        return this.title + " is a work of art.";
    }
}