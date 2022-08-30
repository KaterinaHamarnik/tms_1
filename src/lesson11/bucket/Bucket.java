package lesson11.bucket;

import java.util.*;

public class Bucket {
    private ArrayList <String> collectionOfFruits = new ArrayList<>();
    Apple apple = new Apple();
    Orange orange = new Orange();
    Banana banana = new Banana();

    public void putFruit(String fruit){
        if (collectionOfFruits.size() < 8) {
            if (fruit.equals(apple.name)) {
                collectionOfFruits.add(apple.name);
            } else if (fruit.equals(orange.name)) {
                collectionOfFruits.add(orange.name);
            } else if (fruit.equals(banana.name)) {
                collectionOfFruits.add(banana.name);
            } else {
                System.out.println("Put only apple, orange or banana");
            }
        } else {
            System.out.println("Bucket is full");
        }
    }

    public void takeFruit (){
        if (collectionOfFruits.size() == 0){
            System.out.println("ArrayList is empty!");
        } else {
            LinkedList<String> linkedListOfFruit = new LinkedList<>(collectionOfFruits);
            collectionOfFruits.clear();
            linkedListOfFruit.removeFirst();
            collectionOfFruits.addAll(linkedListOfFruit);
        }
    }

    public void showBucket(){
        System.out.println(collectionOfFruits);
    }
}
