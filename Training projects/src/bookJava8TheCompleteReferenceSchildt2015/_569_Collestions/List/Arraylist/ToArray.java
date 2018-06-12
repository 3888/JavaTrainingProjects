package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.List.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");

        System.out.println("list = " + list);

        String[] strings = list.toArray(new String[list.size()]);

        System.out.println("list.toArray:");
        for (String contents : strings) {
            System.out.print(contents);
        }
        System.out.println("");

        System.out.println("new String[list.size()]");
        strings = new String[list.size()];
        strings = list.toArray(strings);

        for (String contents : strings) {
            System.out.print(contents);
        }
    }
}