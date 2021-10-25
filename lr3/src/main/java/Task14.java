/*Создайте программу, которая осуществляет шифрование / расшифровка методом гаммирования.
В нем ключом является текстовая строка такой же длины, как и открытый текст, а шифрование /
расшифровка заключается в суммировании / вычитании кодов символов открытого текста /
криптотексте с кодами символов ключа.*/

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        String str;
        String key;

        System.out.print("Введите строку для шифровки ");
        str = enterStr();
        System.out.print("Введите ключ ");
        key = enterStr();

        if (str.length() != key.length()) {
            System.out.println("Строки должны быть одинаковой длины");
            System.exit(0);
        }

        StringBuffer cipher = encryption(str.toCharArray(), key.toCharArray());
        System.out.println(cipher);
        StringBuffer decoded = decryption(cipher.toString().toCharArray(), key.toCharArray());
        System.out.println(decoded);
    }

    public static String enterStr() {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        if(!str.matches("[а-яА-Я]+")) {
            System.out.println("Входные данные должны быть только буквами");
            System.exit(0);
        }
        return str;
    }

    public static StringBuffer encryption(char[] str, char[] key){
        StringBuffer result = new StringBuffer();
        int z, k = 0, x = 0;

        char[] codeH = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П',
                'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я'};
        char[] codeh = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я'};

        for (int i=0; i<str.length; i++) {

            for (int j=0; j<codeH.length; j++){
                if (codeH[j] == str[i]) x = j;
                if (codeH[j] == key[i]) k = j;

                if (codeh[j] == str[i]) x = j;
                if (codeh[j] == key[i]) k = j;
            }

            z = (x + k) % 33;
            result.append(codeH[z]);
        }
        return result;
    }

    public static StringBuffer decryption(char[] str, char[] key){
        StringBuffer result = new StringBuffer();
        int z = 0, k = 0, x;

        char[] codeH = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П',
                'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я'};
        char[] codeh = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я'};

        for (int i=0; i<str.length; i++) {

            for (int j=0; j<codeH.length; j++){
                if (codeH[j] == str[i]) z = j;
                if (codeH[j] == key[i]) k = j;

                if (codeh[j] == str[i]) z = j;
                if (codeh[j] == key[i]) k = j;
            }

            x = (z + 33 - k) % 33;
            result.append(codeH[x]);
        }
        return result;
    }
}