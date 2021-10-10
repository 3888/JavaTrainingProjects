package material.mutable_and_immutable;

public class Program {
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println(str);
        str.toLowerCase();
        System.out.println(str);
        String str1 = str.toLowerCase();
        System.out.println(str1);
    }
}
