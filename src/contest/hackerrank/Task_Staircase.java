package contest.hackerrank;

import java.util.Scanner;

public class Task_Staircase {
//    https://www.hackerrank.com/challenges/staircase

    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
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

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
//        int count = 8;
        int[] spacesCount;
        String space = null;
        String[] spaces = new String[count];
        String input;
        String[] output = new String[count];
        int position = 0;
        spacesCount = new int[count];
        String symbol = "#";
        String spaceSymbol = " ";

        for (int j = count - 1; j >= 0; j--) {
            spacesCount[position] = j;
//            System.out.println(spacesCount[position]);
            for (int i = 1; i <= spacesCount[position]; i++) {
                space = stringBuilder.append(spaceSymbol).toString();
            }
//            System.out.println("space = " + space);
            spaces[position] = space;
            position++;
            stringBuilder.setLength(0);
        }
        spaces[count - 1] = "";

        for (int i = 0; i < count; i++) {
            input = stringBuilder.append(symbol).toString();
            output[i] = input;
//            System.out.println(output[i]);
        }
        stringBuilder.setLength(0);

        for (int i = 0; i < count; i++) {
            System.out.println(stringBuilder.append(spaces[i]).toString() + output[i]);
            stringBuilder.setLength(0);
        }
    }
}



