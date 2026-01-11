package oop;
public abstract class Painting extends Art { // public class that extends art
    public final boolean IS_2D = true; // if painting is 2d then it is a painting
    public Painting(String title) { // passes title to art by using "supper" method
        super(title);
    }
    public String hang() { // if title belongs to a painting, it can be hung on a wall
        return this.getTitle() + " can be hung on the wall.";
    }
}