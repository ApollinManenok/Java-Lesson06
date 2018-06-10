package by.itacademy.lesson06.calculator;

public class Multiplication implements Operable {
    @Override
    public double operation(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public String typo() {
        return "Multiplication";
    }
}
