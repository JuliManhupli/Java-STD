/*Построить программу для работы с классом для хранения данных о кривой второго порядка - эллипсе.
Программа должна обеспечивать простейшие функции: расчет у по х и наоборот, ввод значений, вывод значений.*/

import java.util.Scanner;

public class Task2 {
    public static void main(String []args) {
        Ellipse o = InputEllipse();
        System.out.println(o);

        double x = InputValue("x");
        System.out.println(o.Calculation_y(x));

        double y = InputValue("y");
        System.out.println(o.Calculation_x(y));

    }

    public static Ellipse InputEllipse() {
        double a = InputValue("a");
        double b = InputValue("b");
        return new Ellipse(a, b);
    }

    public static double InputValue(String name) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение " + name + " ");
        while (!in.hasNextDouble()) {
            System.out.println("Входные данные должны быть типа double");
            in.next();
        }
        return in.nextDouble();
    }
}



