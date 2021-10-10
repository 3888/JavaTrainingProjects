package books.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("First");
        colorList.add("Second");
        colorList.add("Third");
        colorList.add(0, "NewFirst");
        colorList.add(3,"Black");


        System.out.println("toString() = " + colorList.toString());
    }
}
