package lesson11.bucket;

public class Main{
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.putFruit(new Banana());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Orange());
        bucket.showBucket();
    }
}
