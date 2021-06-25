package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap_perestanovka {

    public static void main(String[] args) {
        List<String> integersList = new ArrayList<String>();

        integersList.add("A");
        integersList.add("B");
        integersList.add("C");
        integersList.add("D");
        integersList.add("EAST");
        integersList.add("F");
        System.out.println("toString() = " + integersList.toString());

        Collections.swap(integersList,0 ,5);
        System.out.println("swap() = " + integersList);
    }
}
