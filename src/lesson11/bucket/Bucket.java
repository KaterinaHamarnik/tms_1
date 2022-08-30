package lesson11.bucket;

import java.util.*;

public class Bucket implements IntFruit {
    private ArrayList <Object> collectionOfFruits = new ArrayList<>();


    public void putFruit(Object fruit){
        if (collectionOfFruits.size() < 8) {
            if (fruit.equals(apple)) {
                collectionOfFruits.add(new Apple());
            } else if (fruit.equals(orange)) {
                collectionOfFruits.add(new Orange());
            } else if (fruit.equals(banana)) {
                collectionOfFruits.add(new Banana());
            } else {
                System.out.println("Put only apple, orange or banana");
            }
        } else {
            System.out.println("Bucket is full");
        }
    }

    public Object takeFruit (){
        if (collectionOfFruits.size() == 0){
            System.out.println("ArrayList is empty!");
        } else {
            LinkedList <Object> linkedListOfFruit = new LinkedList<>(collectionOfFruits);
            collectionOfFruits.clear();
            linkedListOfFruit.removeFirst();
            collectionOfFruits.addAll(linkedListOfFruit);
        }
        return collectionOfFruits;
    }

    public void showBucket(){
        System.out.println(collectionOfFruits);
    }
}
