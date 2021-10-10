package todo.TrainingProjects.hackerrank;

import java.util.Scanner;

public class Task_StarCase160130BadCode {
    public static void main(String[] args) {
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