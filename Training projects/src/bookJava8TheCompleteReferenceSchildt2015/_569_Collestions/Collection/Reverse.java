package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 3888 on 18.12.2016.
 */
public class Reverse {

    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<Integer>();
//          integersList.add(null);
        integersList.add(0);
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(4);
        integersList.add(5);
        System.out.println("toString() = " + integersList.toString());

        Collections.reverse(integersList);
        System.out.println("reverse() = " + integersList);
    }
}
