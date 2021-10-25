/*Определить, образуют ли значения    элементов исходного одномерного массива a: арифметическую прогрессию,
т.е.  ai = ai-1 + n, где n – разность прогрессии и вывести соответствующее сообщение.*/

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        int[] arr;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите елементы массива ");
        try {
            String[] tempArr =  in.nextLine().split(" ");
            arr = new int[tempArr.length];
            for (int i = 0; i < tempArr.length; i++) {
                arr[i] =Integer.parseInt(tempArr[i]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Входные данные должны быть цифрами");
            return;
        }

        if (progressionCheck(arr)) System.out.println("Арифметическая прогрессия!");
        else System.out.println("Не арифметическая прогрессия");

    }

    public static boolean progressionCheck(int[] arr) {
        boolean progression = true;
        int n = arr[1] - arr[0];
        for( int i=0; i < arr.length - 1; i++) {
            if (arr[i+1] != arr[i] + n) {
                progression = false;
                break;
            }
        }
        return progression;
    }

}
