package by.itacademy.lesson06.calculator;

public class RoundCalculator extends BaseCalculator implements CalculateRound{
    public long up(double num){return (long)Math.ceil(num);}
    public long down(double num){return (long)Math.floor(num);}
}
