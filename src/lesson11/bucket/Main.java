package lesson11.bucket;

public class Main implements IntFruit{
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.putFruit(apple);
        bucket.showBucket();
        bucket.putFruit(orange);
        bucket.showBucket();
        bucket.putFruit(banana);
        bucket.showBucket();
        bucket.takeFruit();
        bucket.showBucket();

    }
}
