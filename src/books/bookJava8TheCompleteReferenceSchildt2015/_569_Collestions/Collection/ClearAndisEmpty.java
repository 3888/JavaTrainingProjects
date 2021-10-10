package books.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class ClearAndisEmpty {

    public static void main(String[] args) {
        // create an empty array list
       List<String> colorList = new ArrayList<String>();

        // use add() method to add values in the list
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");

        // use clear() method to Removes all of the elements from this list
        colorList.clear();

        System.out.println("isEmpty "+ colorList.isEmpty());
        System.out.println("colorList.clear() -> size  = "+ colorList.size());
    }
}
