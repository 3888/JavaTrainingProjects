package TrainingProjects.bookCleanCode2010RobertMartin.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinePicker00BadCode {

    private static List<int[]> theList = new ArrayList<>();

    public static void main(String[] args) {
        theList.add(new int[]{0, 1});
        getThem();
    }

    private static List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList) {
            if (x[1] == 1) {
                list1.add(x);
            }
        }
        System.out.println(Arrays.deepToString(list1.toArray(new int[list1.size()][])));

        return list1;
    }
}
