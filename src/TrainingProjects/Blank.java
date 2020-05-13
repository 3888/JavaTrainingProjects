package TrainingProjects;

import java.util.concurrent.TimeUnit;

public class Blank {

    public static void main(String[] args) throws Exception {

        long dateFrom = 1459630800;
        long dateTo = 1491166800;

        long days = TimeUnit.MILLISECONDS.toDays(dateTo - dateFrom);


        System.out.println(dateTo - dateFrom);
        System.out.println(TimeUnit.SECONDS.toDays(31536000));
        System.out.println(days);


        long num1;
        long num2;
        String operation;

        java.util.Scanner number = new java.util.Scanner(System.in);
        java.util.Scanner operand = new java.util.Scanner(System.in);

        System.out.print("Enter, first number: ");
        while (!number.hasNextLong()) {
            System.out.print("It's not a number, input the number please: ");
            number.next();
        }

        num1 = number.nextLong();

        System.out.print("Enter, second number: ");
        while (!number.hasNextLong()) {
            System.out.print("It's not a number, input the number please: ");
            number.next();
        }

        num2 = number.nextLong();

        System.out.print("Enter, operation [+ - * /]: ");
        while (!operand.hasNext("[+-/\\*]")) {
            System.out.print("It's not an operand, input operand please: ");
            operand.next();
        }

        operation = operand.next();

        switch (operation) {
            case "+":
                System.out.println("Result of addition: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result of subtraction: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result of multiplying: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Result of division: " + ((double) num1 / num2));
                break;
        }
        number.close();
        operand.close();


    }
}
