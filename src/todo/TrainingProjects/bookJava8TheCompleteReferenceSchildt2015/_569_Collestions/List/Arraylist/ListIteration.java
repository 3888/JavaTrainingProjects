package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.List.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteration {

    public static void main(String[] argv) {
        // create list
        List<String> stringList = new ArrayList<String>();

        // add 4 different values to list
        stringList.add("eBay");
        stringList.add("Paypal");
        stringList.add("Google");
        stringList.add("Yahoo");

        // iterate via "for loop"
        System.out.println("==> For Loop Example...");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // iterate via "New way to loop"
        System.out.println("\n==> Advance For Loop Example...");
        for (String temp : stringList) {
            System.out.println(temp);
        }

        // iterate via "iterator loop"
        System.out.println("\n==> Iterator Example...");
        Iterator<String> crunchifyIterator = stringList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }


        // iterate via "while loop"
        System.out.println("\n==> While Loop Example...");
        int i = 0;
        while (i < stringList.size()) {
            System.out.println(stringList.get(i));
            i++;
        }

        // collection stream() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==> collection stream() util...");
        stringList.forEach((temp) -> {
            System.out.println(temp);
        });
    }
}