/*Преобразование аргументов, задаваемых при запуске программы. Программа определяет тип аргумента –
двоичное число без знака или строка (шаблон: двоичным числом без знака считается строка, которая содержит одну или
более цифр 0 и 1). Введенные аргументы-числа преобразуются в шестнадцатеричные числа (каждые четыре цифры двоичного
числа преобразуются в одно шестнадцатеричное, поэтому, при необходимости, в значение аргумента  добавляются нули до
длины, кратной 4). Программа выводит количество заданных аргументов, их значения, а также количество аргументов-чисел
и их шестнадцатеричные значения.*/

public class Task38 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы не введены");
            System.exit(0);
        }
        System.out.print("Введеные аргументы ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.printf("\nКоличество аргументов %d\n", args.length);

        StringBuffer s = new StringBuffer();
        int count = 0;
        for (String arg : args) {
            if (arg.matches("^[01]+$")) {
                s.append(arg).append(' ');
                count++;
            }
        }
        System.out.printf("Введеные аргументы двочные чисела %s \n", s);
        System.out.printf("Количество аргументов двочных чисел %d\n", count);
        StringBuffer result = transformation(s.toString());
        System.out.printf("%s \n", result);
    }

    public static StringBuffer transformation(String str){
        StringBuffer result = new StringBuffer();
        String[] subStr;
        String[] num;
        subStr = str.split("\\s");
        for(int i = 0; i < subStr.length; i++) {
            while (subStr[i].length() % 4 != 0) {
                subStr[i] += "0";
            }
            num = subStr[i].split("(?<=\\G.{4})");
            for (String s : num) {
                int a = Integer.parseInt(s, 2);

                result.append(Integer.toHexString(a).toUpperCase() + " ");
            }

        }
        return result;
    }
}

