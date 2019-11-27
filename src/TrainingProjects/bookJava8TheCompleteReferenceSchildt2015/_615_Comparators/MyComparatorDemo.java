package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparatorDemo {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        Comparator<String> comparatorLambda = (aSrt, bStr) -> bStr.compareTo(aSrt);

        //создать древовилное множество типа TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(new MyComparatorReversed());
        TreeSet<String> treeSetJ8Reversed = new TreeSet<String>(myComparator.reversed());
        TreeSet<String> treeSetJ8Lambda = new TreeSet<String>(comparatorLambda);
        //внести элементы в древовидное множество

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("EAST");
        treeSet.add("F");
        treeSet.add("D");

        treeSetJ8Reversed.add("C");
        treeSetJ8Reversed.add("A");
        treeSetJ8Reversed.add("B");
        treeSetJ8Reversed.add("EAST");
        treeSetJ8Reversed.add("F");
        treeSetJ8Reversed.add("D");

        treeSetJ8Lambda.add("C");
        treeSetJ8Lambda.add("A");
        treeSetJ8Lambda.add("B");
        treeSetJ8Lambda.add("EAST");
        treeSetJ8Lambda.add("F");
        treeSetJ8Lambda.add("D");

        //вывести элементы из древовидного множества
        System.out.println("treeSet");
        for (String element : treeSet)
            System.out.print(element + " ");
        System.out.println();

        System.out.println("treeSetJ8Reversed");
        for (String element : treeSetJ8Reversed)
        System.out.print(element + " ");
        System.out.println();

        System.out.println("treeSetJ8Lambda");
        for (String element : treeSetJ8Lambda)
            System.out.print(element + " ");
        System.out.println();
    }
}