package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Collection;

import java.util.ArrayList;
import java.util.List;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
//        stringList.add(null);
//        stringList.add(null);
        stringList.add("This ");
        stringList.add("is ");
        stringList.add("a ");
        stringList.add("good ");
        stringList.add("program.");

        List<String> stringListTwo = new ArrayList<String>();
        stringListTwo.add("This ");
        stringListTwo.add("is ");
        stringListTwo.add("a ");
        stringListTwo.add("good ");
//        stringListTwo.add("super ");
        stringListTwo.add("program.");

        System.out.println("stringList.equals(stringListTwo) " + stringList.equals(stringListTwo));
        System.out.println("stringList.hashCode() " + stringList.hashCode());
        System.out.println("stringListTwo.hashCode() " + stringListTwo.hashCode());

        List<Integer> integersList = new ArrayList<Integer>();
//          integersList.add(null);
        integersList.add(0);
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
//
//        System.out.println("stringList.size() = " + stringList.size());
//        System.out.println("integersList.size() = " + integersList.size());
//        System.out.println("stringList.equals(integersList) " + stringList.equals(integersList));
//
//        stringList.clear();
//        integersList.clear();
//        System.out.println("stringList.size() = " + stringList.size());
//        System.out.println("integersList.size() = " + integersList.size());
//        System.out.println("stringList.equals(integersList) " + stringList.equals(integersList));


    }
}
