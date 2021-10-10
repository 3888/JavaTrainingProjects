package contest.turing;

import java.util.*;
import java.util.stream.Collectors;

public class LickyNumbersCountInArray {
    public static void main(String[] args) {


        int[] values =
//                {2, 2, 3,4};
//                {1, 2, 2, 3, 3, 3};
//                {2, 2, 2, 3,3};
                {5};

        System.out.println(countElements(values));

    }

    public static int countElements(int[] arr) {

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());


        Set<Integer> arrSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());


        Map<Integer, Integer> luckyNumbers = new HashMap<>();

        for (Integer value : arrSet) {
            luckyNumbers.put(value, Collections.frequency(list, value));
        }

        int max = Collections.max(luckyNumbers.values());

        int result = -1;

        if (max > result) result = max;
        if (result == 1) result = -1;

        return result;

    }

}
//
//
//package contest.turing;
//
//        import java.util.*;
//        import java.util.stream.Collectors;
//
//public class ItemsCountInArray2 {
//    public static void main(String[] args) {
//
//
//        int[] values =
////                {2, 2, 3,4};
////                {1, 2, 2, 3, 3, 3};
////                {2, 2, 2, 3,3};
//                {5};
//
//        System.out.println(countElements(values));
//
//    }
//
//    public static int countElements(int[] arr) {
//
//        List<Integer> list = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toList());
//
//
//        Set<Integer> arrSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
//
//
//        Map<Integer, Integer> luckyNumbers = new HashMap<>();
//
//        for (Integer value : arrSet) {
//            luckyNumbers.put(value, Collections.frequency(list, value));
//        }
//
//
//        System.out.println(luckyNumbers);
//
//        int max = Collections.max(luckyNumbers.values());
//
//        System.out.println(max);
//
//        int result = -1;
//
//        if (max > result) result = max;
//        if (result == 1) result = -1;
//
//        return result;
//
//    }
//
//}
//
//
//
//
//
//
//
