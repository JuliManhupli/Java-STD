package Interfaces;

public interface Figure {
    void set_a(double a);
    double get_a();
    void set_b(double b);
    double get_b();
    void set_c(double c);
    double get_c();
    String toString();
    /**
     * Function for calculating the value of the area of a triangle
     * @return returns the area value of a triangle
     */
    double Square();

    /**
     * Function for calculating the value of the perimeter of a triangle
     * @return returns the perimeter value of a triangle
     */
    double Perimeter();

    /**
     * Function for calculating the value of the heights to side a of a triangle
     * @return returns the heights to side a value of a triangle
     */
    double HeightToSideA();

    /**
     * Function for calculating the value of the heights to side b of a triangle
     * @return returns the heights to side b value of a triangle
     */
    double HeightToSideB();

    /**
     * Function for calculating the value of the heights to side c of a triangle
     * @return returns the heights to side c value of a triangle
     */
    double HeightToSideC();
}
