package by.itacademy.lesson06.calculator;

public interface Calculate {
    public double plus(double num1, double num2);
    public double minus(double num1, double num2);
    public double multiplication(double num1, double num2);
    public double division(double num1, double num2) throws DivisionException;
}
