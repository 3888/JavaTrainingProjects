package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 3888 on 18.12.2016.
 */
public class MinAndMax {
    public static void main(String[] args) {

        //create an ArrayList object
        List<Integer> arrayList = new ArrayList<Integer>();

        //Add elements to Arraylist
        arrayList.add(456654);
        arrayList.add(654654);
        arrayList.add(1);
        arrayList.add(4645645);
        arrayList.add(99999999);

        HashSet <Long> hashSet = new HashSet <Long> ();

        //Add elements to LinkedHashSet
        hashSet.add(342123123123123L);
        hashSet.add(34222344123123L);
        hashSet.add(3425533333L);
        hashSet.add(3422121211L);
        hashSet.add(342178789873123L);

        Object object = Collections.min(arrayList);
        System.out.println("Minimum Element of Java ArrayList is : " + object);
        object = Collections.max(arrayList);
        System.out.println("Maximum Element of Java ArrayList is : " + object);

        object = Collections.min(hashSet);
        System.out.println("Minimum Element of Java hashSet is : " + object);
        object = Collections.max(hashSet);
        System.out.println("Maximum Element of Java hashSet is : " + object);
    }
}