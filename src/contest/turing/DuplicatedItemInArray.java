package contest.turing;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatedItemInArray {
    public static void main(String[] args) {

        int[] values =
//                {1, 2, 3, 4, 3};
//                {1, 2, 3, 4, 5, 5};
//                {1, 2, 3, 4, 5, 2};
                //                {1, 2, 2};
                {1, 2, 3, 2};

        System.out.println(Arrays.toString(findErrorNums(values)));

    }

    public static int[] findErrorNums(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());


        Set<Integer> arrSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        Map<Integer, Integer> duplicated = new HashMap<>();

        for (Integer value : arrSet) {
            duplicated.put(value, Collections.frequency(list, value));
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("duplicated = " + duplicated);
        int indexOfDuplicatedValue;


        int maxMapValue = Collections.max(duplicated.values());

        indexOfDuplicatedValue = duplicated.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), maxMapValue))
                .map(Map.Entry::getKey)
                .findFirst().get() - 1;

        System.out.println("indexOfDuplicatedValue = " + indexOfDuplicatedValue);


        ArrayList<Integer> answer = new ArrayList<>(2);

        if (indexOfDuplicatedValue == 2 & nums.length == 3) {
            answer.add(indexOfDuplicatedValue);
            answer.add(nums.length);
            return answer.stream().mapToInt(i -> i).toArray();

        }

        for (int i = indexOfDuplicatedValue + 1; i < nums.length; i++) {
            if (nums[i] == indexOfDuplicatedValue + 1) {
                answer.add(indexOfDuplicatedValue + 1);
                answer.add(i + 1);
            }
        }


        return answer.stream().mapToInt(i -> i).toArray();
    }



}
