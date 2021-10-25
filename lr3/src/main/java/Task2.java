/*Вывести таблицу преобразований целых десятичных чисел в интервале от min до max с шагом
step в 16-ном представлении. Параметры задачи задаются как параметры командной строки.*/

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        int min = 0, max = 0, step = 0;

        if (args.length != 3) {
            System.out.println("Командная строка должна содержать 3 аргумента");
            return;
        }
        try {
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[1]);
            step = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Входные данные должны быть цифрами");
        }

        ArrayList<String> interval = printInterval(min, max, step);
        for (String value : interval) {
            System.out.print(value);
        }
    }

    public static ArrayList<String> printInterval(int min, int max, int step) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = min; i <= max; i += step) {
            String str = String.format("%d = %s\n", i, Integer.toHexString(i).toUpperCase());
            result.add(str);
        }

        return result;
    }
}

