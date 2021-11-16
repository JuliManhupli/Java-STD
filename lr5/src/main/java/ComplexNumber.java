import Interfaces.Complex;

import java.util.Objects;

/**
 * ComplexNumber class with properties <b>x</b>,<b>y</b> and <b>z</b>
 */
public class ComplexNumber implements Complex {
    /** Field of the variable x */
    private double x;
    /** Field of the variable y */
    private double y;
    /** Field of the variable z */
    private String z;

    /**
     * Constructor - creating a new object
     * @see ComplexNumber#ComplexNumber(double, double)
     */
    public ComplexNumber() {
        this.x = 0;
        this.y = 0;
        this.z = "0.0 + i*0.0";
    }

    /**
     * Constructor - creating a new object with specific values
     * @param x variable x
     * @param y variable y
     * @see ComplexNumber#ComplexNumber()
     */
    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = x + " + i*" + y;
    }

    /**
     * Function for determining the value of the field x {@link ComplexNumber#x}
     * @param x variable x
     */
    public void set_x(double x) {
        this.x = x;
    }

    /**
     * Function to get the value of the field x {@link ComplexNumber#x}
     * @return returns the values of field x
     */
    public double get_x() {
        return x;
    }

    /**
     * Function for determining the value of the y field {@link ComplexNumber#y}
     * @param y variable y
     */
    public void set_y(double y) {
        this.y = y;
    }

    /**
     * Function to get the value of the y field {@link ComplexNumber#y}
     * @return returns the values of field y
     */
    public double get_y() {
        return y;
    }

    /**
     * Function for determining the value of the z field {@link ComplexNumber#z}
     * @param z variable z
     */
    public void set_z(String z) {
        if (!z.matches("[0-9.]+ \\+ i\\*[0-9.]+")) {
            System.out.println("Неправильный формат ввода комплексного числа!");
            this.z = "0 + i*0";
        }
        else {
            this.z = z;
        }
    }

    /**
     * Function to get the value of the z field {@link ComplexNumber#z}
     * @return returns the values of field z
     */
    public String get_z() {
        return z;
    }

    /**
     * Function to display a complex number in standard form
     * @return returns a string containing information complex number in standard form
     */
    @Override
    public String toString() {
        return "Стандартная форма: " + z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Objects.equals(z, that.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
