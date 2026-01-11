package oop;
public abstract class Sculpture extends Art {
    public final boolean IS_3D = true;
    public Sculpture(String title) {
        super(title);
    }
    public String displayOnPedestal() {
        return this.getTitle() + " can be hung on the wall.";
    }
}