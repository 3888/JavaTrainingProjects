package todo.TrainingProjects.tutorials.array;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) throws Exception {

        int twoDArray[][] = new int[10][6];

        twoDArray[0][0] = 1;

        System.out.println("twoDArray number of rows = " + twoDArray.length);
        System.out.println("twoDArray number of columns = " + twoDArray[0].length);

//        System.out.println(Arrays.deepToString(twoDArray));
        System.out.println(Arrays.deepToString(twoDArray).replace("], ", "]\n"));
    }
}
