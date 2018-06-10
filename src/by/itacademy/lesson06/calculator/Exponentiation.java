package by.itacademy.lesson06.calculator;

public class Exponentiation implements Operable {
    @Override
    public double operation(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    @Override
    public String typo() {
        return "Exponentiation";
    }
}
