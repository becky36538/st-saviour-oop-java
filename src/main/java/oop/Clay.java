package oop;
public class Clay extends Sculpture {
    public int pieces;
    public Clay(String title, int pieces) {
        super(title);
        this.pieces = pieces;
    }
    public void addPiece() {
        this.pieces += 1;
    }
}