package books.bookJava8TheCompleteReferenceSchildt2015._188_Recrussion;

public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("result = " + f.fact(3));
//        System.out.println("result = " + f.fact(4));
//        System.out.println("result = " + f.fact(5));
    }
}

class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
//        result = fact(n - 1) + n; // fib?
        result = fact(n - 1) * n;
        return result;
    }
}

