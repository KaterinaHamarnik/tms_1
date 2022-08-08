package lesson3.DirectAndReverseOrder;

import java.text.DecimalFormat;

public class DirectAndReverseOrder {
    public static void main(String[] args) {
        double[] array = new double[5];
        DecimalFormat df = new java.text.DecimalFormat("#.##");
        for (int i = 0; i <= array.length - 1; i++){
            array[i] = Math.random();
            System.out.println(df.format(array[i]));
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(df.format(array[i]));
        }
    }
}
