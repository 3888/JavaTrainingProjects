package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.List.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListSizeListIndexArrayLength {
    public static void main(String[] args) {
//        printIntArrayAndListJava8();
//        printIntArrayAndList();
        printIntArraySizeAndIndex();

    }

    private static void printIntArraySizeAndIndex() {
        int intArray[] = {44, 55, 33, 63, 87};
        List<Integer> list = new ArrayList<>();
        for (int i : intArray) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("index = " + i);
            System.out.println("value = " + list.get(i));
        }

        System.out.println("intArray.length = " + intArray.length);
        System.out.println("list.size = " + list.size());

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("intArray[0] = " + intArray[0]);

        try {
            System.out.println("value = " + list.get(list.size()));

        } catch (Exception e) {
            System.out.println("Exception = " + e);
        }
    }

    private static void printStringArrayAndList() {
        String[] stringArray = {"One", "Two", "Three"};
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, stringArray);
        System.out.println("stringArray.length = " + stringArray.length);
        System.out.println("list.size = " + stringList.size());
    }

    private static void printIntArrayAndListJava8() {
        /*
         In Java 8, you can use the Stream APIs to do the boxing and conversion
         */
        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println("intArray.length = " + intArray.length);
        System.out.println("intList.size = " + intList.size());
    }
}