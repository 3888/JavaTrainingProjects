package contest.turing;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemsCountInArray {
    public static void main(String[] args) {


        int[] values =
//                {1, 2, 3};
//                {1, 1, 3, 3, 5, 5, 7, 7};
//                {1, 3, 2, 3, 5, 0};
//                {1, 1, 2, 2};
                {1, 1, 2};

        System.out.println(countElements(values));

    }

    public static int countElements(int[] arr) {

        /*
        https://mkyong.com/java8/java-8-streams-map-examples/
        * */

        int[] newArr = Arrays.stream(arr).map(n -> n + 1).toArray();

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(newArr));

        Set<Integer> arrSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        Set<Integer> newArrSet = Arrays.stream(newArr).boxed().collect(Collectors.toSet());

//        System.out.println(arrSet);
//        System.out.println(newArrSet);

        Integer[] sortedArr = arrSet.toArray(new Integer[arrSet.size()]);
        Integer[] sortedNewArr = newArrSet.toArray(new Integer[newArrSet.size()]);


        int count = 0;

        for (int i = 0; i < sortedArr.length; i++) {
//            System.out.println(sortedArr[i]);
//            System.out.println(sortedNewArr[i]);
            if (Arrays.asList(sortedArr).contains(sortedNewArr[i])
            ) {
                count++;
            }
        }


        return count;

    }

}



