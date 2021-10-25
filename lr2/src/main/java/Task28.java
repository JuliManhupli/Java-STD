/*Сформировать массив b  из исходного одномерного массива  a следующим образом:
если amin < bi < amax, то bi = ai; если bi ≤ amin, то bi=amin; если bi ≥ amax, то bi=amax
(amax и amin  - заданные значения).*/

import java.util.Arrays;
import java.util.Random;

public class Task28 {

    public static void main(String[] args) {
        int[] arr;
        arr = fillTheArray(10);
        System.out.printf("Массив A: %s %n", Arrays.toString(arr));

        Random num = new Random();
        int max = num.nextInt((40 - 30) + 1) + 30;
        int min = num.nextInt((30 - 25) + 1) + 25;
        int[] arrResult = formArrayB(arr, min, max);
        System.out.printf("Amin: %d, Amax: %d %n", min, max);
        System.out.printf("Массив B: %s %n", Arrays.toString(arrResult));
    }

    public static int[] fillTheArray(int size) {
        int[] arr = new int[size];
        Random num = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt(50);
        }
        return arr;
    }

    public static int[] formArrayB(int[] a, int aMin, int aMax){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            int elem = a[i];
            if(elem > aMin && elem < aMax) {
                b[i] = elem;
            }
            else if(elem <= aMin) {
                b[i] = aMin;
            }
            else {
                b[i] = aMax;
            }
        }
        return b;
    }
}

