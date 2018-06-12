package android.study;

public class getenv {

    public static void main(String[] args) throws Exception {

        // gets the value of the specified environment variable "PATH"
        System.out.println("TwoDArray PATH");
        System.out.println(System.getenv("PATH"));

        // gets the value of the specified environment variable "TEMP"
        System.out.println("TwoDArray TEMP");
        System.out.println(System.getenv("TEMP"));

        // gets the value of the specified environment variable "USERNAME"
        System.out.println("TwoDArray USERNAME");
        System.out.println(System.getenv("USERNAME"));

        System.out.println("TwoDArray RELEASE_PASSWORD");
        System.out.println((System.getenv("RELEASE_PASSWORD")));


        System.out.println("TwoDArray KEYSTORE");
        System.out.println((System.getenv("KEYSTORE")));


        System.out.println("TwoDArray KEYSTORE_PASSWORD");
        System.out.println((System.getenv("KEYSTORE_PASSWORD")));

        System.out.println("TwoDArray KEY_PASSWORD");
        System.out.println((System.getenv("KEY_PASSWORD")));

        System.out.println("TwoDArray KEY_ALIAS");
        System.out.println((System.getenv("KEY_ALIAS")));

    }

}
