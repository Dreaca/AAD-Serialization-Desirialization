package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
       Animal animal = null;

        try (FileInputStream fileIn = new FileInputStream("animal.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            animal = (Animal) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (animal != null) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.species);
        }
    }
}
