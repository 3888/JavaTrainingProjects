package material.collections.arrays;

/*
https://www.softwaretestinghelp.com/java-string-array/
* */
public class Arrays {
    public static void main(String[] args) {

        String[] array;   //String array declaration without size
        String[] arrayWithSize = new String[5];//String array declaration with size

        String[] inlineInitializationsArray = {"one", "two", "three"};
                /*
        In the above String Array, the initializations are inline initializations. The String Array is initialized at the same time as it is declared.
         */


        String[] declaredInitializationArray = new String[]{"one", "two", "three", "four"};
        /*
        Here the String Array is declared first. Then in the next line, the individual elements are assigned values. Once the String Array is initialized, you can use it in your program normally.
        */
    }
}
