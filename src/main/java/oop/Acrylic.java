package oop;
public class Acrylic extends Painting { // public class that extends painting
    public int layers; // variable (layers) related to acrylic paintings
    public Acrylic(String title, int layers) {
        super(title); // supper used to indicate title and number of layers used in acrylic painting
        this.layers = layers;
    }
    public void addLayer() { // adds layer of acrylic paint to the painting
        this.layers += 1; 
    }
    
}