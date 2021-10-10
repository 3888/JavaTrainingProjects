package contest.hackerrank;

public class Task06JavaLoopsI {
    public static void main(String[] args) {
//        Sample Input
//        2
//        Sample Output
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//        2 x 5 = 10
//        2 x 6 = 12
//        2 x 7 = 14
//        2 x 8 = 16
//        2 x 9 = 18
//        2 x 10 = 20

        int result = 2;
        for (int i = 1; i <= 10; i++) {
//            System.out.println(result + " x " + (i) + " = " + result * (i));

//            System.out.print(result);
//            System.out.print(" x ");
//            System.out.print(i);
//            System.out.print(" = ");
//            System.out.println(result * i);

            System.out.printf("%d x %d = %d%n", result, i, result * i);
        }
    }
}
