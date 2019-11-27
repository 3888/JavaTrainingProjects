package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class Contains {

    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");

        // use contains() method to check if this list contains the specified element
        boolean containsRes = colorList.contains("Red");
        boolean containsBlue = colorList.contains("Blue");

        System.out.println("containsRes  = " + containsRes);
        System.out.println("containsBlue  = " + containsBlue);


    }
}
