package books.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String args[]) {
        // Takes a list o Dog objects
        List<todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog> list = new ArrayList<todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog>();

        list.add(new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog("Jesica", 3));
        list.add(new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog("Lucky", 2));
        list.add(new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog("Roger", 10));
        list.add(new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog("Tommy", 4));
        list.add(new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog("Will", 1));
        Collections.sort(list);   // Sorts the array list

        for(todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog a: list)   // printing the sorted list of names
            System.out.println(a.getDogName() + ", ");

        // Sorts the array list using comparator
        Collections.sort(list, new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.tutorialspoint.Dog());
//        Collections.sort(list);
        System.out.println(" ");

        for(Dog a: list)   // printing the sorted list of ages
            System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
    }
}