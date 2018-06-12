package logicUpgrade;

public class Indiabix_percentage_of_numbers_from_1_to_n_which_have_x_or_y {

    //    What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?
    public static double percentage = 0;

    public static void main(String[] args) {

        int n = 11;
        String x = "1";
        String y = "9";
        for (int i = 1; i <= n; i++) {
            String value = String.valueOf(i);
            checkNumbers(value, x, y);
            System.out.print(value + ", ");
            if (value.length() > 1) {
                value = value.substring(value.length() - 1, value.length());
//                System.out.print("\n" + "value.length() > 1 " + value + "\n");
                checkNumbers(value, x, y);
            }

        }
//        System.out.println("\n" + "percentage = " + percentage);
        percentage = (percentage / n) * 100;

        System.out.println("\n" + "percentage = " + percentage + "%");
    }

    private static void checkNumbers(String value, String firstValue, String secondValue) {
        if (value.equals(firstValue) | value.equals(secondValue)) {
            System.out.println("\n" + "percentage ++ ");
            percentage++;
        }
    }
}