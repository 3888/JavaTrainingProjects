package TrainingProjects.android.study.TestTasks.Roulette;

import java.util.Random;
import java.util.Scanner;


public class MainRoulette {

    public static void main(String[] arg) {

        int gameOver = 0;

        MoneyBalance balance = new MoneyBalance();

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello!!! This is Java Roulette game.");
        System.out.println("");
        System.out.println("Your money balnce is: " + balance.getBalance());
        System.out.println("");

        boolean exit = false;

        do {

            System.out.println("Place your bets form 1 to 10");

            Random rn = new Random();


            int bid = 0;


            try {
                bid = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("Incorrect format");
                continue;
            }

            if (bid >= 1 && bid <= 10) {

            } else {
                System.out.println("Incorrect format");
                continue;
            }

            int result = rn.nextInt(10) + 1;
            System.out.println("result = " + result);

            if (result != bid) {
                System.out.println("Reget you lose (((");

                System.out.println("Your money balnce is: " + balance.getBalanceLoose());

            } else {
                System.out.println("Congratulations!!! You win )))");

                System.out.println("Your money balnce is: " + balance.getBalanceWin());

            }

            if (balance.getBalance() == gameOver) {
                exit = true;
                System.out.println("GAME OVER");
            }


        } while (!exit);


    }


}
