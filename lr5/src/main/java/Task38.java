/*Создайте класс Треугольник (3 стороны, метод расчета площади)
и построенный на его основе класс Четырехугольник.*/


import java.util.Scanner;

public class Task38 {
    public static void main(String []args) {
        Triangle o1 = InputTriangle();
        System.out.println(o1);

        System.out.println("Плодадь " + o1.Square());
        System.out.println("Периметр " + o1.Perimeter());
        System.out.println("Высота к стороне а " + o1.HeightToSideA());
        System.out.println("Высота к стороне b " + o1.HeightToSideB());
        System.out.println("Высота к стороне c " + o1.HeightToSideC());

        Quadrangle o2 = InputQuadrangle();
        System.out.println(o2);

        System.out.println("Плодадь " + o2.Square());
        System.out.println("Периметр " + o2.Perimeter());

    }

    public static Triangle InputTriangle() {
        double a = InputValue("a");
        double b = InputValue("b");
        double c = InputValue("c");
        if (!(a + b > c) || !(a + c > b) || ! (b + c > a)){
            System.out.println("Треугольника не существует");
            return InputTriangle();
        }
        else {
            return new Triangle(a, b, c);
        }
    }

    public static Quadrangle InputQuadrangle() {
        double a = InputValue("a");
        double b = InputValue("b");
        return new Quadrangle(a, b);
    }

    public static double InputValue(String name) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение стороны " + name + " ");
        while (!in.hasNextDouble()) {
            System.out.println("Входные данные должны быть типа double");
            in.next();
        }
        return in.nextDouble();
    }
}

