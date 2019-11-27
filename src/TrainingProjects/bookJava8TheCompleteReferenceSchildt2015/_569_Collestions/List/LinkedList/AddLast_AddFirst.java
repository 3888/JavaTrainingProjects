package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.List.LinkedList;


import java.util.LinkedList;

public class AddLast_AddFirst {

    public static void main(String[] args) {


        //create LinkedList object
        LinkedList<String> linkedList = new LinkedList<String>();

        //add elements to LinkedList
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println("LinkedList contains : " + linkedList);

    /*
     * To add an element at the beginning of the LinkedList, use
     * void addFirst(Object obj) method.
     *
     * This method inserts object at the beginning of the LinkedList.
     */

        linkedList.addFirst("First");
        System.out.println("After inserting (addFirst) 'First' at beginning, LinkedList contains :"
                + linkedList);

    /*
     * To append an element at end of the LinkedList, use
     * void addLast(Object obj) method.
     *
     * This method append specified element at the end of the LinkedList.
     */

        linkedList.addLast("6");
        System.out.println("After (addLast) '6' at end, LinkedList contains :" + linkedList);

        linkedList.add("Last");
        System.out.println("After (add) 'Last' at end, LinkedList contains :" + linkedList);

        linkedList.add(3, "By index");
        System.out.println("After insert by index, LinkedList contains :" + linkedList);

        linkedList.remove(5);
        System.out.println("After remove by index, LinkedList contains :" + linkedList);

        linkedList.removeFirst();
        System.out.println("After removeFirst, LinkedList contains :" + linkedList);

        linkedList.removeLast();
        System.out.println("After removeLast, LinkedList contains :" + linkedList);

        System.out.println("linkedList.get(0)  :" + linkedList.get(0));
    }
}

