/*Дано целое число A. Вычислить A8, используя вспомогательную
переменную и три операции умножения. Для этого последовательно находить
A2, A4, A8. Вывести все найденные степени числа A.*/

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int a, b;
        System.out.print ("Enter number a: ");
        Scanner num = new Scanner (System.in);
        a = num.nextInt();
        System.out.println ("a = " + a);
        b = a * a;
        System.out.println ("a^2 = " + b);
        b = b * b;
        System.out.println ("a^4 = " + b);
        b = b * b;
        System.out.println ("a^8 = " + b);
    }
}
