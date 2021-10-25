/*Выведите на дисплей  распределение значений элементов массива a по интервалам.
Границы интервалов задаются в виде массива b, причем нулевой элемент определяет нижнюю границу первого интервала,
а элементы с 1-го по n-ый - верхние границы интервалов. В результате работы программы на дисплей должны быть выведены
строки «Интервал nn – xx» и последняя строка «Вне интервалов – xx».*/

import java.util.ArrayList;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        int[] a;
        int[] b;

        System.out.print("Введите елементы массива ");
        a = enterArrayElements();
        System.out.print("Введите границы ");
        b = enterArrayElements();

        ArrayList<String> intervals = printAInIntervals(a, b);
        for (String value : intervals) {
            System.out.println(value);
        }
    }

    public static int[] enterArrayElements(){
        Scanner in = new Scanner(System.in);
        int[] result = new int[0];
        try {
            String[] tempArr =  in.nextLine().split(" ");
            result = new int[tempArr.length];
            for (int i = 0; i < tempArr.length; i++) {
                result[i] = Integer.parseInt(tempArr[i]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Входные данные должны быть цифрами");
        }
        return result;
    }

    public static ArrayList<String> printAInIntervals(int[] arr, int[] intervals) {
        ArrayList<String> result = new ArrayList<String>();
        int rightBound;
        int leftBound = intervals[0];
        String str = "";;
        for(int i=0; i < intervals.length-1; i++) {
            rightBound = intervals[i + 1];
            for(int j = 0; j < arr.length; j++) {
                int value = arr[j];
                if (value >= leftBound && value <= rightBound) {
                    str += value + " ";
                }
            }
            result.add( "Интервал " + leftBound + "-" + rightBound + ": " + str);
            str = "";
        }


        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            if (value < leftBound || value > intervals[intervals.length-1]) {
                str += value + " ";
            }
        }
        result.add("Вне интервалов: " + str);

        return result;
    }
}
