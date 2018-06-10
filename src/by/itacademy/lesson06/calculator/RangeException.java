package by.itacademy.lesson06.calculator;

public class RangeException extends Exception { //Should I remove public as IDEA suggesting?
    public RangeException(String message) {
        super(message);
    }
}
