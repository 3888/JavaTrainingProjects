package contest.hackerrank;


import java.util.Scanner;

public class Task07JavaLoopsII {
    /*Nick White Solution*/
//          for (int j = 0; j< n;  j++){
//        a += b;
//
//        if (j > 0){
//            System.out.print (" ");
//        }
//
//        System.out.print (a);
//        b = b *2;
//    }
//            System.out.print ("\n");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int value = 2;
        int exponentiation;
        int sum;

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = 0;

            for (int j = 0; j < n; j++) {
                exponentiation = (int) Math.pow(value, j);
                if (j == 0) {
                    sum += a + exponentiation * b;
                } else {
                    sum += exponentiation * b;
                }
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.print("\n");

        }
        in.close();


    }
}

/*Sample Input*/

//        2
//        0 2 10
//        5 3 5

/*Sample Output*/

//        2 6 14 30 62 126 254 510 1022 2046
//        8 14 26 50 98

//             a   2*0 b
//        s0 = 5 + 1 * 3 = 8
//             a   2*0 b   2*1 b
//        sl = 5 + 1 * 3 + 2 * 3 = 14
//             a   2*0 b   2*1 b   2*2 b
//        s2 = 5 + l * 3 + 2 * 3 + 4 * 3 = 26
//             a   2*0 b   2*1 b   2*2 b   2*3 b
//        s3 = 5 + l * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50
//
//        s4 = 5 + l*3 + 2*3 + 4*3 + 8*3 + 16*3 = 98