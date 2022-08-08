package lesson3.MaxAndMin;

import java.text.DecimalFormat;

public class MaxAndMin {
    public static void main(String[] args) {
        double[] array = new double[5];
        DecimalFormat df = new java.text.DecimalFormat("#.###");
        for (int i = 0; i <= array.length - 1; i++){
            array[i] = Math.random();
            System.out.println(df.format(array[i]));
        }
        double max = array[0];
        double min = array[0];
        for (double i: array){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        System.out.println("Max is " + df.format(max));
        System.out.println("Min is " + df.format(min));
    }
}
