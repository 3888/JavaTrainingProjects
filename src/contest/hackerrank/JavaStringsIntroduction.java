package contest.hackerrank;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        String A = "hello";
        String B = "java";


        System.out.println(A.concat(B).length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

               String A1 = A.substring(0, 1);
        String B1 = B.substring(0, 1);
        System.out.println(A1.toUpperCase().concat(A.substring(1))
                + " " + B1.toUpperCase() + B.substring(1));
    }
}
