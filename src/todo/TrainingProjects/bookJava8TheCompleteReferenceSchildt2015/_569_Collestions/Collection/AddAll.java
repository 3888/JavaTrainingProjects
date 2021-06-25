package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static void main(String args[]) {

        // create an empty array list1 with an initial capacity
        List<Integer> arrayListOne = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrayListOne.add(12);
        arrayListOne.add(20);
        arrayListOne.add(45);

        // let us print all the elements available in list1
        System.out.println("Printing list1:");
        for (Integer number : arrayListOne) {
            System.out.println("Number = " + number);
        }

        // create an empty array list2 with an initial capacity
        ArrayList<Integer> arrayListTwo = new ArrayList<Integer>(5);

        // use add() method to add elements in list2
        arrayListTwo.add(25);
        arrayListTwo.add(30);
        arrayListTwo.add(31);
        arrayListTwo.add(35);

        // let us print all the elements available in list2
        System.out.println("Printing list2:");
        for (Integer number : arrayListTwo) {
            System.out.println("Number = " + number);
        }

        // inserting all elements, list2 will get printed after list1
        arrayListOne.addAll(arrayListTwo);

        System.out.println("Printing all the elements");
        // let us print all the elements available in list1
        for (Integer number : arrayListOne) {
            System.out.println("Number = " + number);
        }
    }
}