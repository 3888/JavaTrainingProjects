package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.List.Arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class EnsureCapacity_583 {

    public static void main(String args[]) throws Exception {

         /*create an empty array list with an initial capacity*/
        ArrayList<Integer> integers = new ArrayList<Integer>(5);

        /*ugly hack*/
        getCapacity(integers);

        /* use add method to add elements*/
        integers.add(10);
        integers.add(50);
        integers.add(30);

        /* this will increase the capacity of the ArrayList to 15 elements*/
        integers.ensureCapacity(15);
        integers.add(10);
        integers.add(50);
        integers.add(30);
        integers.add(10);
        integers.add(50);
        integers.add(30);
        integers.add(10);
        integers.add(50);
        integers.add(30);

        /*ugly hack*/
        getCapacity(integers);

        integers.trimToSize();
         /*ugly hack*/
        getCapacity(integers);

        // let us print all the elements available in list
//        for (Integer number : integers) {
//            System.out.println("Number = " + integers );
//        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Number = " + i + " " + integers.get(i));
        }
    }
/* https://stackoverflow.com/questions/3564837/capacity-of-arraylist */
    private static void getCapacity(ArrayList<?> arrayList) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        System.out.println("Capacity  = " + ((Object[]) dataField.get(arrayList)).length);
    }
}
