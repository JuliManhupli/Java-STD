/*Определить   абсолютные значения наибольшей и наименьшей разности между
средним значением и значениями элементов исходного одномерного массива a.*/

import java.util.Random;
import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        int[] arr;
        arr = fillTheArray(10);
        System.out.printf("Массив: %s %n", Arrays.toString(arr));
        MinMaxResult result = findMinMaxDifference(arr);
        System.out.printf("Наименьшая разница: %.2f %n", result.getMin());
        System.out.printf("Наибольшая разница: %.2f %n", result.getMax());

    }

    public static int[] fillTheArray(int size) {
        int[] arr = new int[size];
        Random num = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt(50);
        }
        return arr;
    }

    public static MinMaxResult findMinMaxDifference(int[] arr) {
        int sum = 0;
        double aver;
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;


        for( int i : arr) sum += i;
        aver = (double) sum / arr.length;

        for( double i : arr) {
            double num = Math.abs((aver - i));
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new MinMaxResult(min, max);
    }

}

record MinMaxResult(double min, double max) {
    MinMaxResult(double min, double max) {
        this.min = Math.round(min * 100.0) / 100.0;
        this.max = Math.round(max * 100.0) / 100.0;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}