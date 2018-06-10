package by.itacademy.lesson06.calculator;

public class Percentage implements Operable {
    @Override
    public double operation(double num1, double num2) {
        return (num2 / 100) * num1;
    }

    @Override
    public String typo() {
        return "Percentage";
    }
}
