package oop;

import java.util.ArrayList;

public class ArtTest { // title of the lass
    public static void main(String[] args) {
        ArrayList<> artList = new ArrayList<>(); // creates an arraylist with art objects

        artList.add(new Acrylic("Sunset", 3)); // adds objects to child classes in arraylist
        artList.add(new Clay("Vase", 5));

        System.out.println(display()); // uses the grandparent class to return the title of the artwork
        if (artList instanceof Painting) {
            System.out.println("It is a painting! :P"); // if any art titles in the list are paintings, this text will be printed
        }
        if (artList instanceof Clay) {
            System.out.println("It is a sculpture! :o"); // if any art titles in the list are sculptures, this text will be printed
        }
    }
}