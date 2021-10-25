/*Квадратное уравнение задано действительными коэффициентами A, B, C.
Проверить, имеет ли оно корни.*/

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        double a, b, c, D;
        System.out.print ("Enter coefficient A: ");
        Scanner num1 = new Scanner (System.in);
        a = num1.nextDouble();
        System.out.print ("Enter coefficient B: ");
        Scanner num2 = new Scanner (System.in);
        b = num2.nextDouble();
        System.out.print ("Enter coefficient C: ");
        Scanner num3 = new Scanner (System.in);
        c = num3.nextDouble();
        D = Math.pow(b, 2) - 4 * a * c;
        if (D >= 0)
            System.out.println ("Equation has roots");
        else
            System.out.println ("Equation has no roots");
    }
}
