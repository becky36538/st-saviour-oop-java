package oop;
public class Clay extends Sculpture { // public class that extends painting
    public int pieces; // variable (clay) related to sculptures
    public Clay(String title, int pieces) {
        super(title); // supper used to indicate title and number of layers used in acrylic painting
        this.pieces = pieces;
    }
    public void addPiece() { // adds a piece of clay to the sculpture
        this.pieces += 1; 
    }
}