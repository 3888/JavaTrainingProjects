package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class ToString {

    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<>();

        // use add() method to add values in the list
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");

        System.out.println("colorList = " + colorList);
        System.out.println("toString() = " + colorList.toString());
    }
}
