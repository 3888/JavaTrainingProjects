package android.study.TestTasks;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		boolean exit = false; 		
	Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();

    String[] elements = string.split(" ");
    
    try
    {
    do
    {

   
            double first = Double.parseDouble(elements[0]);
            double second = Double.parseDouble(elements[2]);

            String operation = elements[1];

            if (operation.equals("+"))
            {
                    System.out.println("Your answer is " + (first + second));
            }
            else if (operation.equals("-"))
            {
                    System.out.println("Your answer is " + (first - second));
            }
            else if (operation.equals("/"))
            {
                    if (second == 0)
                    {
                            System.out.println("You cannot divide to zero");
                    }
                    else
                    {
                            System.out.println("Your answer is " + (first / second));
                    }
            }
            else if (operation.equals("*"))
            {
                    System.out.println("Your answer is " + (first * second));
            }
    }
    
    
    while(!exit);
    }
    
    catch (Exception e)
    {
            System.out.println("Incorrect format");
    }
}
}