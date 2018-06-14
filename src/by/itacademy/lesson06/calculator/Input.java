package by.itacademy.lesson06.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Input {
    private final static Logger LOGGER = Logger.getLogger(Input.class.getName());
    static double doubleEnter() { //IDEA предложила отказаться в классе и методах от public и final
        double result;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            try {
                result = scan.nextDouble();
                break;
            } catch (InputMismatchException e) {
                LOGGER.log(Level.INFO, "User input: " + scan.next(), e);
            }
        }
        return result;
    }

    static int intEnter() {
        int result;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            try {
                result = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                LOGGER.log(Level.INFO, "User input: " + scan.next(), e);
            }
        }
        return result;
    }
}
