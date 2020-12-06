package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotate {
    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("0 White");
        colorList.add("1 Black");
        colorList.add("2 Red");
        colorList.add("3 Green");
        colorList.add("4 Yellow");
        colorList.add("5 Blue");

        System.out.println(colorList);

        Collections.rotate(colorList,1);

        System.out.println(colorList);
    }
}