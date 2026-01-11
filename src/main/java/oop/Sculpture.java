package oop;
public abstract class Sculpture extends Art { // public class that extends art
    public final boolean IS_3D = true; // if painting is 3d then it is a painting
    public Sculpture(String title) { // passes title to art by using "supper" method
        super(title);
    }
    public String displayOnPedestal() { // if title belongs to a sculpture, it will be displayed on a pedestal
        return this.getTitle() + " is displayed on a pedestal.";
    }
}