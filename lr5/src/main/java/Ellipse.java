import Interfaces.Curse;

import java.util.Objects;

/**
 * Ellipse class with properties <b> a </b> and <b> b </b>
 */
public class Ellipse implements Curse {
    /** Field of the variable a */
    private double a;
    /** Field of the variable b */
    private double b;

    /**
     * Constructor - creating a new object
     * @see Ellipse#Ellipse (double, double)
     */
    public Ellipse() {
        a = 0;
        b = 0;
    }

    /**
     * Constructor - creating a new object with specific values
     * @param a variable a
     * @param b variable b
     * @see Ellipse#Ellipse ()
     */
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Function for determining the value of the field a {@link Ellipse#a}
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
     * Function to get the value of the field a {@link Ellipse#a}
     * @return returns the values of field a
     */
    public double get_a() {
        return a;
    }

    /**
     * Function for determining the value of the b field {@link Ellipse#b}
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
     * Function to get the value of the b field {@link Ellipse#b}
     * @return returns the values of field b
     */
    public double get_b() {
        return b;
    }


    @Override
    public double Calculation_y(double x) {
        double y = 0;
        if (x >= a) {
            System.out.println("x < a");
        }
        else {
            y = Math.sqrt(1 - (x * x) / (a * a)) * b;
        }
        return Math.round(y * 100.0) / 100.0;
    }


    @Override
    public double Calculation_x(double y) {
        double x = 0;
        if (y >= b) {
            System.out.println("y < b");
        }
        else {
            x = Math.sqrt(1 - (y * y) / (b * b)) * a;
        }
        return Math.round(x * 100.0) / 100.0;
    }

    /**
     * Function for deriving the equation of the ellipse
     * @return returns a string that contains the equation of the ellipse
     */
    @Override
    public String toString() {
        return "(x^2 / " + a + "^2) + (y^2 /" + b + "^2)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.a, a) == 0 && Double.compare(ellipse.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

