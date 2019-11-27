package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
//        NavigableSet<String> set = new TreeSet<>();
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("EAST");
        set.add("F");
        set.add("1");
        set.add("3");
        set.add("8");


        System.out.println(set);
        System.out.println(set.subSet("C","F"));
        System.out.println(set.lower("C"));
        System.out.println(set.higher("C"));
        System.out.println(set.floor("A")); // ?
        System.out.println(set.ceiling("A")); // ?
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());


    }

}
