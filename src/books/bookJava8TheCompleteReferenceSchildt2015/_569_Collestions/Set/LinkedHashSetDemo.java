package books.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Set;

import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String args[]) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();

        for (int aCount : count) {
            set.add(aCount);
        }
        System.out.println(set);

        // Create LinkedHashSet.
        HashSet<String> hash = new HashSet<>();
        hash.add("castle");
        hash.add("bridge");
        hash.add("castle"); // Duplicate element.
        hash.add("moat");

        // Display size.
        System.out.println(hash.size());
        System.out.println("isEmpty() " + hash.isEmpty());

        // See if these three elements exist.
        System.out.println(hash.contains("castle"));
        System.out.println(hash.contains("bridge"));
        System.out.println(hash.contains("moat"));

        // An ArrayList of three Strings.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("socrates");
        arrayList.add("plato");
        arrayList.add("cebes");

        // Add all elements to LinkedHashSet.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);

        // Use contains.
        boolean a = hashSet.contains("cebes");
        System.out.println("contains(\"cebes\") " + a);

        // Use containsAll.
        boolean b = hashSet.containsAll(arrayList);
        System.out.println(b);



    }

}
