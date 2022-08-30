package lesson11.bucket;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.putFruit("Apple");
        bucket.showBucket();
        bucket.takeFruit();
        bucket.showBucket();
        bucket.putFruit("Apple");
        bucket.putFruit("Orange");
        bucket.putFruit("Banana");
        bucket.putFruit("Apple");
        bucket.takeFruit();
        bucket.showBucket();
        bucket.putFruit("Apple");
        bucket.putFruit("Apple");
        bucket.putFruit("Apple");
        bucket.putFruit("Apple");
        bucket.showBucket();
        bucket.putFruit("Apple");
        bucket.showBucket();
        bucket.putFruit("Apple");
    }
}
