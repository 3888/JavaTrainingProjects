package books.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
    public static void main(String[] args) {
        // create an empty array list
        List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        System.out.println("First List :" + colorList);
        // create an empty array sample with an initial capacity
        List<String> sample = new ArrayList<String>();

        // use add() method to add values in the list
        sample.add("Green");
        sample.add("Red");
        sample.add("White");

        System.out.println("Second List :" + sample);
        // remove all elements from second list if it exists in first list
        sample.removeAll(colorList);


        System.out.println("Second List removeAll() :" + sample);
    }
}