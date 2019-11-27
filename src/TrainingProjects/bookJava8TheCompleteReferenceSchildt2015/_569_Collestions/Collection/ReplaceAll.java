package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceAll {
    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        System.out.println("First List :" + colorList);

        Collections.replaceAll(colorList,"Red", "New");

        System.out.println("Second List replaceAll() :" + colorList);
    }
}