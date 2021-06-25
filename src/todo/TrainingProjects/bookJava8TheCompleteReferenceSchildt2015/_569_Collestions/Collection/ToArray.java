package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

//    https://www.tutorialspoint.com/javaexamples/collection_conversion.htm
//    http://stackoverflow.com/questions/15422161/java-list-t-t-toarrayt-a-implementation

public class ToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");
        String[] strings = list.toArray(new String[list.size()]);

        for (String contents : strings) {
            System.out.print(contents);
        }
        System.out.println("");
//
//        List<Integer> integersList = new ArrayList<Integer>();
//        integersList.add(0);
//        integersList.add(1);
//        integersList.add(2);
//        integersList.add(3);
//
//        System.out.println("foreach");
//
//        for (int contents : integersList) {
//            System.out.print(contents);
//        }
//
//        System.out.println("");
//
//        Integer[] integersOne = new Integer[integersList.size()];
//        integersList.toArray(integersOne);
//
//        for (int contents : integersOne) {
//            System.out.print(contents);
//        }
//        System.out.println("");
//
//
//
//
//        Integer[] integersTwo = integersList.toArray(new Integer[integersList.size()]);
//        integersList.toArray(integersTwo);
//
//        for (int contents : integersTwo) {
//            System.out.print(contents);
//        }
//        System.out.println("");
//
//        Integer[] integersThree = integersList.toArray(new Integer[0]);
//        integersList.toArray(integersThree);
//
//        for (int contents : integersThree) {
//            System.out.print(contents);
//        }
//        System.out.println("");
    }
}