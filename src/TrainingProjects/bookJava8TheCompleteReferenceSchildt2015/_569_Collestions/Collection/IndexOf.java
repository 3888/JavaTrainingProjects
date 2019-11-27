package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Pee");

        System.out.println("" + list.indexOf("Apple"));
    }
}