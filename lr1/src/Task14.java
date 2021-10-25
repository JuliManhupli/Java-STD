/*Даны целые катеты прямоугольного треугольника, найти высоту и
гипотенузу.*/

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        double a, b, c, h;
        System.out.print ("Enter the length of the first cathetus: ");
        Scanner num1 = new Scanner (System.in);
        a = num1.nextDouble();
        System.out.print ("Enter the length of the second cathetus: ");
        Scanner num2 = new Scanner (System.in);
        b = num2.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf ("Hypotenuse: %.3f %n", c);
        h = a * b / c;
        System.out.printf ("Height: %.3f %n", h);
    }
}
