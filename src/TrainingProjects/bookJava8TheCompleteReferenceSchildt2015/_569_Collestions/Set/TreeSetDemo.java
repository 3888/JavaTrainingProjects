package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[]) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();

//            for (int i = 0; i < count.length; i++) {
//                set.add(count[i]);
//            }
        for (int aCount : count) {
            set.add(aCount);
        }
        System.out.println(set);

        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);

        System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
        System.out.println("The last element of the set is: " + (Integer) sortedSet.last());

    }
}
