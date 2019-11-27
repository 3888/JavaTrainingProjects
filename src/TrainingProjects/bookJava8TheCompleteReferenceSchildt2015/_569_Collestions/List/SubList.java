package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.List;


import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

//Addition of elements in ArrayList
        stringList.add("Steve");     //0
        stringList.add("Justin");    //1
        stringList.add("Ajeet");     //2
        stringList.add("John");      //3
        stringList.add("Arnold");    //4
        stringList.add("Chaitanya"); //5

        System.out.println("Original ArrayList Content: " + stringList);

        //Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<String>(stringList.subList(1, 4));
        System.out.println("SubList stored in ArrayList: " + al2);

        //Sublist to List
        List<String> list = stringList.subList(1, 4);
        System.out.println("SubList stored in List: " + list);
    }
}