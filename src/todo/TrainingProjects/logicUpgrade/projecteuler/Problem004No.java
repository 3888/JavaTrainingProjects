package todo.TrainingProjects.logicUpgrade.projecteuler;

//      A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit result is 9009 = 91 ? 99.
//
//        Find the largest palindrome made from the product of two 3-digit result.
public class Problem004No {
//
//    ������ ����� � ����� ����� ����������� �����
//    ������������� �������
//



    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {

            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int palindrome = 0;
         for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {

//                1) ������ ���������
//                2) ��� �������� � ����������
//                3) �����, ��������� ���������������� � �������� �� ����

//                ����������� ���� ���� ����� �� ��������� �������
//                � ���� ������� �������

                if (isPalindrome(i * j) == true) {
                     if (i*j > palindrome) {
                          palindrome = i * j;
                     }
                }
            }
        }

        System.out.println(palindrome);
    }
}

//
//    public static void main(String[] args) {
//
//        int value = 0;
//        for (int i = 10; i <= 99; i++) {
////            System.out.println("i = " + i);
//            for (int j = i; j <= 99; j++) {
////                System.out.println("j = " + j);
//                int value1 = i * j;
////                System.out.println(value1);
//
//
//                StringBuilder sb1 = new StringBuilder("" + value1);
//                String sb2 = "" + value1;
//                sb1.reverse();
//                System.out.println(value1 + " - reverse: " + sb1);
//
//                if (sb2.equals(sb1.toString()) && value < value1) {
//                    value = value1;
//                }
//            }
//        }
//        System.out.println(value);
//    }
//}


//http://java67.blogspot.com/2012/09/palindrome-java-program-to-check-number.html

//    public static void main(String args[]){
//
//        System.out.println("Please Enter a number : ");
//        int palindrome = new scanner(System.in).nextInt();
//
//        if(isPalindrome(palindrome)){
//            System.out.println("Number : " + palindrome + " is a palindrome");
//        }else{
//            System.out.println("Number : " + palindrome + " is not a palindrome");
//        }
//    }
//
//    /*
//     * Java method to check if number is palindrome or not
//     */
//    public static boolean isPalindrome(int number) {
//        int palindrome = number; // copied number into variable
//        int reverse = 0;
//
//        while (palindrome != 0) {
////            System.out.println("palindrome1 = " + palindrome);
//            int remainder = palindrome % 10;
////            System.out.println("remainder = " + remainder);
//            reverse = reverse * 10 + remainder;
////            System.out.println("reverse = " + reverse);
//            palindrome = palindrome / 10;
////            System.out.println("palindrome2 = " + palindrome);
//        }
//
//        // if original and reverse of number is equal means
//        // number is palindrome in Java
//        if (number == reverse) {
//            return true;
//        }
//        return false;
//    }
//}
