package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");

        // remove  elements from second list if it exists in first list
        colorList.remove("Red");
        colorList.remove(0);

        System.out.println(colorList);
    }
}