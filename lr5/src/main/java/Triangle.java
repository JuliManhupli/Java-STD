import Interfaces.Figure;

import java.util.Objects;

/**
 * Triangle class with properties <b>a</b>,<b>b</b> and <b>c</b>
 */
public class Triangle implements Figure {
    /** Field of the variable a */
    private double a;
    /** Field of the variable b */
    private double b;
    /** Field of the variable c */
    private double c;

    /**
     * Constructor - creating a new object
     * @see Triangle#Triangle(double, double, double)
     */
    public Triangle() {
        a = 0;
        b = 0;
        c = 0;
    }

    /**
     * Constructor - creating a new object with specific values
     * @param a variable a
     * @param b variable b
     * @param c variable c
     * @see Triangle#Triangle()
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Function for determining the value of the field a {@link Triangle#a}
     * @param a variable a
     */
    public void set_a(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("Входные данные должны быть больше нуля");
        }
    }

    /**
     * Function to get the value of the field a {@link Triangle#a}
     * @return returns the values of field a
     */
    public double get_a() {
        return a;
    }

    /**
     * Function for determining the value of the b field {@link Triangle#b}
     * @param b variable b
     */
    public void set_b(double b) {
        if (b > 0) {
            this.b = b;
        } else {
            System.out.println("Входные данные должны быть больше нуля");
        }
    }

    /**
     * Function to get the value of the b field {@link Triangle#b}
     * @return returns the values of field b
     */
    public double get_b() {
        return b;
    }

    /**
     * Function for determining the value of the c field {@link Triangle#b}
     * @param c variable c
     */
    public void set_c(double c) {
        if (b > 0) {
            this.c = c;
        } else {
            System.out.println("Входные данные должны быть больше нуля");
        }
    }

    /**
     * Function to get the value of the c field {@link Triangle#b}
     * @return returns the values of field c
     */
    public double get_c() {
        return c;
    }

    /**
     * Function for displaying the values of the side of a triangle
     * @return returns a string containing information about the sides of the triangle
     */
    @Override
    public String toString() {
        return "Стороны треугольника равняются: \na = " + a + ", b = " + b + ", c = " + c;
    }

    @Override
    public double Square() {
        double p = Perimeter() / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return Math.round(S * 100.0) / 100.0;
    }

    @Override
    public double Perimeter() {
        return a + b + c;
    }

    @Override
    public double HeightToSideA() {
        double S = Square();
        double h = 2 * S / a;
        return Math.round(h * 100.0) / 100.0;
    }

    @Override
    public double HeightToSideB() {
        double S = Square();
        double h = 2 * S / b;
        return Math.round(h * 100.0) / 100.0;
    }

    @Override
    public double HeightToSideC() {
        double S = Square();
        double h = 2 * S / c;
        return Math.round(h * 100.0) / 100.0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 && Double.compare(triangle.b, b) == 0 && Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
