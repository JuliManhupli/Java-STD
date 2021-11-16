import Interfaces.Exponential;

/**
 * ExponentialForm class with properties <b>num</b>,<b>standard_form</b> and <b>exponential_form</b>
 */
public class ExponentialForm implements Exponential {
    /** Field of the variable num */
    private ComplexNumber num;
    /** Field of the variable num */
    private String standard_form;
    /** Field of the variable num */
    private String exponential_form;

    /**
     * Constructor - creating a new object with specific values
     * @param num variable num
     */
    public ExponentialForm(ComplexNumber num) {
        this.num = num;
        this.standard_form = num.get_z();
        this.exponential_form = Calculation_exponential_form();
    }

    /**
     * Function to get the value of the field num {@link ExponentialForm#num}
     * @return returns the values of field num
     */
    public ComplexNumber get_num() {
        return num;
    }

    /**
     * Function for determining the value of the field num {@link ExponentialForm#num}
     * @param num variable num
     */
    public void set_num(ComplexNumber num) {
        this.num = num;
    }

    /**
     * Function to get the value of the field standard_form {@link ExponentialForm#standard_form}
     * @return returns the values of field standard_form
     */
    public String get_standard_form() {
        return standard_form;
    }

    /**
     * Function for determining the value of the field standard_form {@link ExponentialForm#standard_form}
     * @param standard_form variable standard_form
     */
    public void set_standard_form(String standard_form) {
        if (!standard_form.matches("[0-9.]+ \\+ i\\*[0-9.]+")) {
            System.out.println("Неправильный формат ввода комплексного числа!");
            this.standard_form = "0 + i*0";
        }
        else {
            this.standard_form = standard_form;
        }
    }

    /**
     * Function to get the value of the field exponential_form {@link ExponentialForm#exponential_form}
     * @return returns the values of field exponential_form
     */
    public String get_exponential_form() {
        return exponential_form;
    }

    /**
     * Function for determining the value of the field exponential_form {@link ExponentialForm#exponential_form}
     * @param exponential_form variable exponential_form
     */
    public void set_exponential_form(String exponential_form) {
        if (!exponential_form.matches("[0-9.]+\\*e\\^\\(i\\*[0-9.]+\\)")) {
            System.out.println("Неправильный формат ввода комплексного числа!");
            this.exponential_form = "0*e^(i*0)";
        }
        else {
            this.exponential_form = exponential_form;
        }
    }

    public String Calculation_exponential_form() {
        double q = Math.atan(num.get_y()/ num.get_x());
        double r = Math.sqrt(Math.pow(num.get_x(), 2) + Math.pow(num.get_y(), 2));

        return Math.round(r * 100.0) / 100.0 + "*e^(i*" + Math.round(q * 100.0) / 100.0 + ")";
    }

    /**
     * Function to display a complex number in standard and exponential form
     * @return returns a string containing information complex number in standard and exponential form
     */
    @Override
    public String toString() {
        return "Стандартная форма: " + standard_form + "\nЭкспоненциальная форма: " + exponential_form;

    }
}
