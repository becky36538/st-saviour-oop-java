package oop;
public abstract class Painting extends Art {
    public final boolean IS_2D = true;
    public Painting(String title) {
        super(title);
    }
    public String hang() {
        return this.getTitle() + " can be hung on the wall.";
    }
}