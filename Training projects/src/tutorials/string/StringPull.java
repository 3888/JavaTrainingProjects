package tutorials.string;

public class StringPull {

    public static void main(String[] args) {

        String s1 = "Dog";
        String s2 = "Dog";
        String s3 = new String("Dog");
        String s4 = s3.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}
