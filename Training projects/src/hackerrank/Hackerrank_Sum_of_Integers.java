package hackerrank;

import java.util.Scanner;

public class Hackerrank_Sum_of_Integers {

//        Complete the given function sum Of lntegers to return the sum of n integers.
//                Input:
//        The first line will contain an integer n, which gives the number of integers in the array.
//        The next line will contain n line separated integers.
//                Constraint:
//        The sum will not exceed the number that can be represented in a long intdata type.
//        Sample Input #1:
//                5
//                1
//                2
//                3
//                4
//                5
//        Sample Output #1:
//                15
//        Sample Input #2:
//                2
//                12
//                12
//        Sample Output #2:
//                24

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int array[] = new int[n];
        System.out.println("array.length = " + array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = scan.nextInt();
            }
        }

        int sum = 0;
        for (int i : array) sum += i;
        System.out.println("sum = " + sum);
    }

}



