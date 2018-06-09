package by.itacademy.lesson06.calculator;

public class BaseCalculator implements Calculate {
    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) throws DivisionException {
        if (num2 == 0)
            throw new DivisionException();
        return num1 / num2;
    }
}
