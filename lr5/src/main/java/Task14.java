/*Создать класс Треугольник. Поля - стороны.
Функции-члены вычисляют площадь, периметр, высоты, устанавливает поля и возвращают значения.
Функции-члены установки полей класса должны проверять корректность задаваемых параметров. */

import java.util.Scanner;

public class Task14 {
    public static void main(String []args) {
        Triangle o = InputTriangle();
        System.out.println(o);

        System.out.println("Плодадь " + o.Square());
        System.out.println("Периметр " + o.Perimeter());
        System.out.println("Высота к стороне а " + o.HeightToSideA());
        System.out.println("Высота к стороне b " + o.HeightToSideB());
        System.out.println("Высота к стороне c " + o.HeightToSideC());

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


