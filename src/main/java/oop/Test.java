package oop;

import java.util.ArrayList;

public class ArtTest {
    public static void main(String[] args) {
        ArrayList<> artList = new ArrayList<>;

        artList.add(new Acrylic("Sunset", 3));
        artList.add(new Clay("Vase", 5));

        System.out.println(display());
        if (artList instanceof Painting) {
            System.out.println("It is a painting! :P");
        }
        if (artList instanceof Clay) {
            System.out.println("It is a sculpture! :o")
        }
    }
}