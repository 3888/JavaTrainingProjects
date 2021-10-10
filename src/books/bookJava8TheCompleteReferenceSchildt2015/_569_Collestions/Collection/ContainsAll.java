package books.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {

    public static void main(String[] args) {

        List<String> colorList = new ArrayList<String>();
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
//        colorList.add("Orange");

        List<String> mixedList = new ArrayList<String>();
        mixedList.add("One");
        mixedList.add("Two");
        mixedList.add("Three");
        mixedList.add("White");
        mixedList.add("Black");
        mixedList.add("Red");
        mixedList.add("Green");
        mixedList.add("Yellow");

        boolean containsMixedList = colorList.containsAll(mixedList);
        boolean containsColors = mixedList.containsAll(colorList);

        System.out.println("colorList contains all elements of mixedList  = " + containsMixedList);
        System.out.println("mixedList contains all elements of colorList  = " + containsColors);
    }
}
