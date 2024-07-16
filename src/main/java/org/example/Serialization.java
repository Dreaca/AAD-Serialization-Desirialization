package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
       Animal animal = new Animal("Cat","Mammal");

        try (FileOutputStream fileOut = new FileOutputStream("animal.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(animal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
