package TrainingProjects;

public class Calculator {
    private static long firstValue;
    private static long secondValue;

    public static void main(String[] args) {
        firstValue = inputNumber("First");
        secondValue = inputNumber("Second");
        inputOperand();
    }

    private static long inputNumber(String number) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter a " + number + " number: ");

        while (!scanner.hasNextLong()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a number, input the number please: \n ", input);
        }

        return scanner.nextLong();
    }

    private static void inputOperand() {
        System.out.print("Enter, operation [+ - * /]: ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.next();

        switch (input) {
            case "+":
                System.out.println("Result of addition: " + (firstValue + secondValue));
                break;
            case "-":
                System.out.println("Result of subtraction: " + (firstValue - secondValue));
                break;
            case "*":
                System.out.println("Result of multiplying: " + (firstValue * secondValue));
                break;
            case "/":
                if (secondValue == 0) {
                    System.out.println("You can't divide for zero");
                    inputOperand();
                } else {
                    System.out.println("Result of division: " + ((double) firstValue / secondValue));
                }
                break;
            default:
                System.out.printf("\"%s\" is not an operand ,please input an operand [+ - * /]: \n ", input);
                inputOperand();
                break;
        }
    }
}

//
//    ввод ничего
//    ввод пробел
//    ввод табуляция
//    делить на ноль ++