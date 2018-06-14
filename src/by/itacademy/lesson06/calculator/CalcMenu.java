package by.itacademy.lesson06.calculator;

import java.util.logging.*;
import java.util.concurrent.TimeUnit;

public class CalcMenu implements Menu {
    private final static Logger LOGGER = Logger.getLogger(CalcMenu.class.getName());//  for LOGGER usage in Input and Division
    private Operable[] operations;
    //private int sleepSec = 5; IDEA suggest to replace it with local variable, but then it would be harder to change waiting seconds

    public CalcMenu() { // Why IDEA offering to remove 'public' here, DivisionError, RangeException and Input? Is that okay to do so?
        this.operations = new Operable[6];
        this.operations[0] = new Addition();
        this.operations[1] = new Subtraction();
        this.operations[2] = new Multiplication();
        this.operations[3] = new Division();
        this.operations[4] = new Exponentiation();
        this.operations[5] = new Percentage();
    }

    @Override
    public void list() {
        boolean term = true;
        while (term) {
            System.out.println("Calculator menu:\n0. Exit");
            for (int i = 0; i < operations.length; i++) {
                System.out.println((i + 1) + ". " + operations[i].typo());
            }
            try {
                term = switcher(Input.intEnter());
            } catch (RangeException e) {
                LOGGER.log(Level.INFO, e.getMessage(), e);
            }
        }
    }

    private boolean switcher(int option) throws RangeException {
        if (option < 0 || option > this.operations.length)
            throw new RangeException("Option out of list range");
        else if (option == 0)
            return false;
        System.out.println("Enter two numbers");
        option -= 1;
        System.out.println(operations[option].typo() + " operation result: " + operations[option].operation(Input.doubleEnter(), Input.doubleEnter()));
        waiting();
        return true;
    }

    private void waiting() {
        try {
            TimeUnit.SECONDS.sleep(5); // instead of sleepSec
        } catch (InterruptedException e) {
            LOGGER.log(Level.INFO, "Something interrupted", e);
        }
    }
}
