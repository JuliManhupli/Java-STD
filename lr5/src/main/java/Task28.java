/*Создать класс «Комплексное число» и класс «Экспоненциальная форма»,
включающий комплексное число в стандартной и экспоненциальной форме и
функцию вычисления экспоненциальной формы числа.
 */

import java.util.Scanner;

public class Task28 {

    public static void main(String []args) {
        ComplexNumber o1 = InputComplexNumber();
        System.out.println(o1);

        ExponentialForm o = new ExponentialForm(o1);
        System.out.println(o);

    }

    public static ComplexNumber InputComplexNumber() {
        double x = InputValue("x");
        double y = InputValue("y");
        return new ComplexNumber(x, y);
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
