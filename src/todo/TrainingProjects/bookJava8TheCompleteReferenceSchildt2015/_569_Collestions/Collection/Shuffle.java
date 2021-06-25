package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

    public static void main(String[] args) {
        List<String> integersList = new ArrayList<String>();

        integersList.add("A");
        integersList.add("B");
        integersList.add("C");
        integersList.add("D");
        integersList.add("E");
        integersList.add("F");
        System.out.println("toString() = " + integersList.toString());

        Collections.shuffle(integersList);
        System.out.println("shuffle() = " + integersList);
    }
}