package TrainingProjects.tutorials.rounding_mode;

import java.math.BigDecimal;

public class RoundingMode {
    public static void main(String[] args) throws Exception {

        long value = 61800;
        long value2 = 39999980;

//        System.out.println("RoundingMode.UP " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.UP));
        System.out.println("RoundingMode.DOWN " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.DOWN));
//        System.out.println("RoundingMode.CEILING " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.CEILING));
        System.out.println("RoundingMode.FLOOR " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.FLOOR));
//        System.out.println("RoundingMode.HALF_EVEN " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.HALF_EVEN));
        System.out.println("RoundingMode.HALF_DOWN " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.HALF_DOWN));
//        System.out.println("RoundingMode.HALF_UP " + value + " = " + addMetricPrefixWithRoundingMode(value, java.math.RoundingMode.HALF_UP));

//        System.out.println("RoundingMode.UP " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.UP));
        System.out.println("RoundingMode.DOWN " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.DOWN));
//        System.out.println("RoundingMode.CEILING " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.CEILING));
        System.out.println("RoundingMode.FLOOR " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.FLOOR));
//        System.out.println("RoundingMode.HALF_EVEN " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.HALF_EVEN));
        System.out.println("RoundingMode.HALF_DOWN " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.HALF_DOWN));
//        System.out.println("RoundingMode.HALF_UP " + value2 + " = " + addMetricPrefixWithRoundingMode(value2, java.math.RoundingMode.HALF_UP));
    }

    public static String addMetricPrefixWithRoundingMode(long value, java.math.RoundingMode mode) {
        String result = "";
        if (value < 1000) {
            result = String.valueOf(value);
        }

        if (value > 999 & value < 1000000) {
            result = String.valueOf(new BigDecimal((float) (value) / 1000)
                    .setScale(2, mode))
                    .concat("\u0020тыс");
        }

        if (value > 999999 & value < 1000000000) {
            result = String.valueOf(new BigDecimal((float) (value) / 1000000)
                    .setScale(2, mode))
                    .concat("\u0020млн");
        }
        return result;
    }
}