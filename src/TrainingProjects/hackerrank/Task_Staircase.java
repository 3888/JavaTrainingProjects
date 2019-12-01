package TrainingProjects.hackerrank;

import java.util.Scanner;

public class Task_Staircase {
//    https://www.hackerrank.com/challenges/staircase

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int spaces = i;
            while (spaces <= n - 1) {
                System.out.print(" ");
                spaces++;
            }
            int stairs = i;
            while (stairs > 0) {
                System.out.print("#");
                stairs--;
            }
            System.out.println();
        }
    }
}



