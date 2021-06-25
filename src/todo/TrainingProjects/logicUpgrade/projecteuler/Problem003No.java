package todo.TrainingProjects.logicUpgrade.projecteuler;

//  The prime factors of 13195 are 5, 7, 13 and 29.
//
//  What is the largest prime factor of the number 600851475143 ?

public class Problem003No {

    public static void main(String[] args) {

        long u = 10;
        long i;

        for (i = 2; u > 1; i++) {
            while (u % i == 0)
                u /= i;
        }
        System.out.println(--i);
    }
}


//
//
//
//    public static void main(String[] args) {
//
//        Random rn = new Random();
//        int testValue = 45;
//        int first;
//        int second;
//
//        for (int i = 2; i > 1; i++) {
//            first = rn.nextInt(testValue) + 2;
//            second = rn.nextInt(testValue) + 2;
//
//           int result = first * second;
//            if (result == testValue) {
//                System.out.println("first = " + first + " second = " + second);
//                break;
//            }
//        }
//    }
//}
//
//
//static long result = 13195;
//        static int tanbleOfSimpleNumbers[] = {
//
//            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
//            47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
//            103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
//            157, 163, 167, 173, 179, 181, 191, 193, 197, 199
//    };
//
//    public static void main(String[] args) {
//
//        int i = 0;
//        while (result % tanbleOfSimpleNumbers[i] > 0) {
////            System.out.println("result % = " + result);
////            System.out.println("i =  " + tanbleOfSimpleNumbers[i]);
//            i++;
//            if (result % tanbleOfSimpleNumbers[i] == 0) {
//                System.out.println("answer = " + tanbleOfSimpleNumbers[i]);
//                result = result / tanbleOfSimpleNumbers[i];
////                System.out.println("new result " + result);
//                if (result == 1)
//                    break;
//            }
//        }
//    }
//
// }


