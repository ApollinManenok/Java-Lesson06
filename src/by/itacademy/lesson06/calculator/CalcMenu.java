package by.itacademy.lesson06.calculator;

public class CalcMenu implements Menuable {
    CalculateRound calc;

    public CalcMenu() {
        this.calc = new RoundCalculator();
    }

    @Override
    public void menu() {
        boolean term = true;
        while (term) {
            System.out.println("Calculator menu:\n1. Plus\n2. Minus\n3. Multiplication\n4. Division\n" +
                    "5. Round up\n6. Round down\nEnter your operation number: ");
            try {
                term = switcher(Inputable.intEnter());
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public boolean switcher(int option) {
        switch (option) {
            case 1: {
                try {
                    System.out.println("Result " + calc.plus(Inputable.doubleEnter(), Inputable.doubleEnter()));
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                break;
            }
            case 2: {
                try {
                    System.out.println("Result " + calc.minus(Inputable.doubleEnter(), Inputable.doubleEnter()));
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                break;
            }
            case 3: {
                try {
                    System.out.println("Result " + calc.multiplication(Inputable.doubleEnter(), Inputable.doubleEnter()));
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                break;
            }
            case 4: {
                try {
                    System.out.println("Result " + calc.division(Inputable.doubleEnter(), Inputable.doubleEnter()));
                } catch (DivisionException e) {
                    System.out.println(e.getMessage());
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                break;
            }
            case 5: {
                try {
                    System.out.println("Result " + calc.up(Inputable.doubleEnter()));
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                break;
            }
            case 6: {
                try {
                    System.out.println("Result " + calc.down(Inputable.doubleEnter()));
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                break;
            }
            default: {
                System.out.println("Wrong input. Exit calculator.");
                return false;
            }
        }
        return true;
    }
}
