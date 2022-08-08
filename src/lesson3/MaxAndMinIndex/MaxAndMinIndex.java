package lesson3.MaxAndMinIndex;

import java.text.DecimalFormat;

public class MaxAndMinIndex {
    public static void main(String[] args) {
        double[] array = new double[5];
        DecimalFormat df = new java.text.DecimalFormat("#.##");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = Math.random();
            System.out.println(df.format(array[i]));
        }
        double max = array[0];
        int maxIndex = 0;
        double min = array[0] + 1;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Max is " + df.format(max) + ", Max index is " + maxIndex);
        System.out.println("Min is " + df.format(min) + ", Min index is " + minIndex);
    }
}
