/**
 * Quadrangle class with properties <b>a</b> and <b>b</b>
 */
public class Quadrangle extends Triangle {

    /**
     * Constructor - creating a new object
     * @see Quadrangle#Quadrangle(double, double)
     */
    public Quadrangle() {
        super(0, 0, 0);
    }

    /**
     * Constructor - creating a new object with specific values
     * @param a variable a
     * @param b variable b
     * @see Quadrangle#Quadrangle()
     */
    public Quadrangle(double a, double b) {
        super(a, b, 0);
    }

    /**
     * Function for displaying the values of the side of a quadrangle
     * @return returns a string containing information about the sides of the quadrangle
     */
    @Override
    public String toString() {
        return "Стороны четырехугольника равняются: \na = " + get_a() + ", b = " + get_b();
    }

    /**
     * Function for calculating the value of the area of a quadrangle
     * @return returns the area value of a quadrangle
     */
    @Override
    public double Square() {
        double S = get_a() * get_b();
        return Math.round(S * 100.0) / 100.0;
    }

    /**
     * Function for calculating the value of the perimeter of a quadrangle
     * @return returns the perimeter value of a quadrangle
     */
    @Override
    public double Perimeter() {
        return (get_a() + get_b()) * 2;
    }

}
