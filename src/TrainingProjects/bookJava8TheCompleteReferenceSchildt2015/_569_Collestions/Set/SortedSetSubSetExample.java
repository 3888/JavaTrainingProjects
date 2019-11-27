package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetSubSetExample {

    public static void main(String[] args) {

        //create TreeSet object
        TreeSet <String> treeSet = new TreeSet<String>();

        //add elements to TreeSet
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("2");
        treeSet.add("5");
        treeSet.add("4");

        System.out.println("TreeSet = " + treeSet);

    /*
      To get the sub Set from Java TreeSet use,
      SortedSet subSet(int from, int to) method of TreeSet class.

      This method returns portion of the TreeSet whose elements range from
      from (inclusive) to to(exclusive).

      Please note that, the SortedSet returned by this method is backed by
      the original TreeSet. So any changes made to SortedSet will be
      reflected back to original TreeSet.
    */
        SortedSet sortedSet = treeSet;
        System.out.println("SortedSet = " + sortedSet);

        System.out.println("SortedSet first() = " + sortedSet.first());
        System.out.println("SortedSet last() = " + sortedSet.last());

        SortedSet sortedSetsubSet = treeSet.subSet("2", "5");


        System.out.println("SortedSet Contains : " + sortedSetsubSet);


    }
}

