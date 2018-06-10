package by.itacademy.lesson06.calculator;

import java.util.logging.Level;

import static by.itacademy.lesson06.calculator.CalcMenu.LOGGER;

public class Division implements Operable {
    @Override
    public double operation(double num1, double num2) {
        if (num2 == 0) {
            DivisionError e = new DivisionError("Division by zero");
            LOGGER.log(Level.SEVERE, num1 + " / " + num2, e);
            throw e;
        }
        return num1 / num2;
    }

    @Override
    public String typo() {
        return "Division";
    }
}
