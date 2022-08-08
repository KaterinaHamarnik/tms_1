package lesson2;

public class interval {
    public static void main(String[] args) {
        int start = 5, finish = 155;
        int random_num = start + (int) (Math.random()*((finish - start)+1));
        if (random_num > 5 && random_num < 100){
            System.out.println(random_num + " is included in lesson2.interval (25;100)");
        }
        else {
            System.out.println(random_num + " isn't included in lesson2.interval (25;100)");
        }
    }
}
