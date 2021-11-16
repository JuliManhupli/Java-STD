package Interfaces;

public interface Curse {
    void set_a(double a);
    double get_a();
    void set_b(double b);
    double get_b();
    String toString();
    /**
     * The function of counting the variable y for x
     * @param x the value of the variable x
     * @return returns the value of the variable y
     */
    double Calculation_y(double x);
    /**
     * The function of counting the variable x for y
     * @param y the value of the variable y
     * @return returns the value of the variable x
     */
    double Calculation_x(double y);
}
