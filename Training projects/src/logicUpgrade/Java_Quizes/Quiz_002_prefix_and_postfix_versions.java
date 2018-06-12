package logicUpgrade.Java_Quizes;

public class Quiz_002_prefix_and_postfix_versions {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = ++b;
        int d = a++;

        System.out.println(c + " " + d);
//        3 1
    }
}
