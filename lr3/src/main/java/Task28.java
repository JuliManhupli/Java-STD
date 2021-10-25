/*Анализ аргументов, задаваемых при запуске программы. Программа определяет строку символов встречающиеся только
в одном из аргументов (например, для аргументов "agc", "cf", "bfc" такой строкой будет строка "gb").
Шаблон аргумента: строка либо латинских букв, либо букв кириллицы. Программа выводит количество заданных
аргументов, их значения и найденную строку символов или сообщение о том, что таких символов нет. */

public class Task28 {
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

        StringBuffer str = new StringBuffer();
        for (String value : args) {
            str.append(value);
        }
        StringBuffer unique = getUniqueChars(str.toString().toCharArray());
        if (unique.equals("")){
            System.out.println("Уникальные символы не найдены");
        }
        else System.out.println("Уникальные символы " + unique);

    }

    public static StringBuffer getUniqueChars(char[] str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            boolean unique = true;
            for (int j = 0; j < str.length; j++) {
                if ((str[i]==str[j]) && (i != j)) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                result.append(str[i]);
        }
        return result;
    }
}

