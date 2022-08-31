package lesson11.bucket;

import java.util.*;

public class Bucket {
    private LinkedList <Fruits> collectionOfFruits = new LinkedList<>();


    public void putFruit(Fruits fruit){
        if (collectionOfFruits.size() < 8) {
            collectionOfFruits.add(fruit);
        } else {
            System.out.println("Bucket is full");
            new ArrayList<String>();
        }
    }

    public Fruits takeFruit (){
        if (collectionOfFruits.size() == 0){
            System.out.println("Bucket is empty!");
            return null;
        } else {
            return collectionOfFruits.removeFirst();
        }
    }

    public void showBucket(){
        System.out.println(collectionOfFruits.toString());
    }
}
