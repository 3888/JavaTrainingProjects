package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._592_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//https://www.tutorialspoint.com/java/java_using_iterator.htm
public class IteratorDemo {

    public static void main(String[] args) {
        // Create an array list
        List <String> stringList = new ArrayList<String>();

        // add elements to the array list
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("EAST");
        stringList.add("F");

        // Use iterator to display contents of stringList
        System.out.print("Original contents of stringList: ");
        Iterator itr = stringList.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator listIterator = stringList.listIterator();

        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set(element + " +");
        }
        System.out.print("Modified contents of stringList: ");
        itr = stringList.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Now, display the list backwards
        System.out.print("Modified list backwards: ");

        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
