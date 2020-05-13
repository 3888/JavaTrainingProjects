package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exception_569 {

    public static void main(String[] args) {
         /*ClassCastException thrown here.*/
        Object i = 42;
        String s = (String) i;

        /*    IndexOutOfBoundsException thrown here.*/
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(0);
//        list.add(1);
//
//        System.out.println(list.get(2));

/*        IllegalArgumentException thrown here.*/
//        TreeSet<String> treeSet = new TreeSet<String>();
//        treeSet.add("1");
//        treeSet.add("2");
//        treeSet.add("3");
//
//        SortedSet sortedSet = treeSet.subSet("8", "3");

        /*UnsupportedOperationException
        https://toster.ru/q/308466
        http://qaru.site/questions/3962/why-do-i-get-an-unsupportedoperationexception-when-trying-to-remove-an-element-from-a-list
		Arrays.asList: возвращает список фиксированного размера, поддерживаемый указанным массивом.
        Вы не можете add к нему; вы не можете remove от него. Вы не можете структурно изменить List  */
//        List<Integer> list1 = Arrays.asList(10, 20, 60, 30, 22, 70, 89);
//        List<Integer> list2 = Arrays.asList(1, 2, 45, 23, 89, 66, 87, 33, 19, 39);
//        list1.addAll(list2);
//        list1.forEach(System.out::println);
    }

}

