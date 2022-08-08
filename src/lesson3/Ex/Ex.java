package lesson3.Ex;

public class Ex {
    public static void main(String[] args) {
        int[] array = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int max = array[0];
        int min = array[0];
        double average = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            average += i;
        }
        average /= array.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
