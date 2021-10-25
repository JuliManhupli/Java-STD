/*Дано целое трехзначное число. В нем зачеркнули первую справа цифру и
приписали ее слева. Вывести полученное число и его квадратный корень.*/

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int num, a;
        System.out.print ("Enter number a: ");
        Scanner n = new Scanner (System.in);
        num = n.nextInt();
        a = num % 10;
        num = num / 10 + a * 100;
        System.out.printf ("Number: %d, square root: %.3f %n", num, Math.sqrt(num));
    }
}
