/*Определить индексы и значения равных элементов (если они есть) исходного   одномерного массива a.*/

import java.util.HashMap;
import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
        int[] arr = new int[0];
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
        }

        var result = equalElements(arr);
        for (var number : result.entrySet()) {
            System.out.printf("Индексы %s - значення %d \n", number.getKey(), number.getValue());
        }
    }

    public static HashMap<String, Integer> equalElements(int[] arr) {
        var result = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    String index = i + "," + j;
                    result.put(index, arr[i]);
                }
            }
        }
        return result;
    }


}
