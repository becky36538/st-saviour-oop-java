package oop;
// abstract grandparent class
public abstract class Art {
    private String title; //private variable
    public Art(String title) { // constructor used for subclasses
        this.title = title;
    }
    public void setTitle(String title) { // method that shows how title changes depending on the artwork
        this.title = title;
    }
    public String getTitle() { // method that retrieves the title of artwork
        return this.title;
    }
    public String display () { // says that any title of artwork is a work of art
        return this.title + " is a work of art.";
    }
}