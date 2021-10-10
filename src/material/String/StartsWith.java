package material.String;

public class StartsWith {
    public static void main(String[] args) {
        String string = ("Welcome to Tutorialspoint.com");

        System.out.println(string);
        System.out.println(string +" startsWith Welcome = " + string.startsWith("Welcome"));
        System.out.println(string +" startsWith Tutorials = "  + string.startsWith("Tutorials"));
    }
}