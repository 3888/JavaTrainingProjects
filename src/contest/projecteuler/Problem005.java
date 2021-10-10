package contest.projecteuler;

//      2520 is the smallest number that can be divided by each of the result from 1 to 10 without any remainder.
//
//       What is the smallest positive number that is evenly divisible by all of the result from 1 to 20?

//http://stackoverflow.com/questions/8024911/project-euler-5-in-python-how-can-i-optimize-my-solution
//public class Problem005 {

//    static long gcd(long a, long b) {
//        return (0 == b) ? a : gcd(b, a % b);
//    }
//
//    static long leastCommonMultiple(long n) {
//        long multiple = 1;
//
//        for (long i = 2; i <= n; i++) {
//            multiple *= i / gcd(i, multiple);
//        }
//
//        return multiple;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(leastCommonMultiple(20));
//
//
//    }
//}




//    public static void main(String[] args) {
//
//        int[] answers = new int[20];
//        for (int i = 0; i < 20; i++) {
//            answers[i] = i + 1;
//        }
//        int answer = 1;
//        for (int i = 0; i < answers.length; i++) {
//            if (answers[i] != 1) {
//                answer *= answers[i];
//                for (int j = answers.length - 1; j >= i; j--) {
//                    if (answers[j] % answers[i] == 0) {
//                        answers[j] = answers[j] / answers[i];
//                    }
//                }
//            }
//        }
//        System.out.println(answer);
//    }
//}







//    }
//        int answer = 1;
//        for (int i = 2; i <= 10; i++) {
//
//            int n = i;
//            int factor = 2;
//            System.out.format("������������ %d �� ������� ���������:", n);
//            while (n > 1 && factor * factor <= n) {
//                while (n % factor == 0) {
//                    System.out.format(" %d,", factor);
//                    n /= factor;
//                }
//                answer *= factor;
//                ++factor;
//            }
//            if (n > 1) {
//                System.out.format(" %d", n);
//                answer *= n;
//
//            }
//            System.out.println();
//
//        }
//        System.out.println(answer);
//    }
//}

//
//� � � � � � .  ����� ��� �����: 168, 180 � 3024.
//
//        � � � � � � � . 168 = 2 � 2 � 2 � 3 � 7 = 2x3 � 3x1 � 7x1 ,
//
//        180 = 2 � 2 � 3 � 3 � 5 = 2x2 � 3x2 � 5x1 ,
//
//        3024 = 2 � 2 � 2 � 2 � 3 � 3 � 3 � 7 = 2x4  � 3x3  � 7x1 .
//
//        ���������� ���������� ������� ���� ������� ���������
//
//        � ����������� ��:
//
//        ��� = 2x4 � 3x3 � 5x1 � 7x1 = 15120 .


//1 1
//2 2
//3 3
//4 2x2
//5 5
//6 3x2
//7 7
//8 2x3
//9 3x2
//10 5 2
//11 11
//12 2x2 3
//13 13
//14 7 2
//15 5 3
//16 2x4
//17 17
//18 3x2 2
//19 19
//20 5 2x2

// 1 * 2x3 * 3x2 * 5 * 7 = 2520
// 1 * 2x4 * 3x2 * 5 * 7 * 11 * 13 * 17 * 19 = 232792560