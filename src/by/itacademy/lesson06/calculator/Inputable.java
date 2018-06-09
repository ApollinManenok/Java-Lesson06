package by.itacademy.lesson06.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Inputable {
    public final static double doubleEnter() throws IntInputException {
        double result;
        Scanner scan = new Scanner(System.in);
        System.out.print(">>> ");
        try {
            result = scan.nextDouble();
        }catch(InputMismatchException e){
            throw new IntInputException();
        }
        return result;
    }
    public final static int intEnter() throws DoubleInputException {
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.print(">>> ");
        try {
            result = scan.nextInt();
        }catch(InputMismatchException e){
            throw new DoubleInputException();
        }
        return result;
    }

    ;
}
