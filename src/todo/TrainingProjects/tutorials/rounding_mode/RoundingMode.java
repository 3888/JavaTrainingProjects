package todo.TrainingProjects.tutorials.rounding_mode;

import java.math.BigDecimal;

public class RoundingMode {
    public static void main(String[] args) throws Exception {

        long thousand = 61800;
        long millions = 39999980;

//        System.out.println("RoundingMode.UP " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.UP));
        System.out.println("RoundingMode.DOWN " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.DOWN));
//        System.out.println("RoundingMode.CEILING " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.CEILING));
        System.out.println("RoundingMode.FLOOR " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.FLOOR));
//        System.out.println("RoundingMode.HALF_EVEN " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.HALF_EVEN));
        System.out.println("RoundingMode.HALF_DOWN " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.HALF_DOWN));
//        System.out.println("RoundingMode.HALF_UP " + thousand + " = " + addMetricPrefixWithRoundingMode(thousand, java.math.RoundingMode.HALF_UP));

//        System.out.println("RoundingMode.UP " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.UP));
        System.out.println("RoundingMode.DOWN " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.DOWN));
//        System.out.println("RoundingMode.CEILING " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.CEILING));
        System.out.println("RoundingMode.FLOOR " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.FLOOR));
//        System.out.println("RoundingMode.HALF_EVEN " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.HALF_EVEN));
        System.out.println("RoundingMode.HALF_DOWN " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.HALF_DOWN));
//        System.out.println("RoundingMode.HALF_UP " + millions + " = " + addMetricPrefixWithRoundingMode(millions, java.math.RoundingMode.HALF_UP));
    }

    public static String addMetricPrefixWithRoundingMode(long value, java.math.RoundingMode mode) {
        String result = "";
        if (value < 1000) {
            result = String.valueOf(value);
        }

        if (value > 999 & value < 1000000) {
            result = String.valueOf(new BigDecimal((float) (value) / 1000)
                    .setScale(2, mode))
                    .concat("\u0020thousand");
        }

        if (value > 999999 & value < 1000000000) {
            result = String.valueOf(new BigDecimal((float) (value) / 1000000)
                    .setScale(2, mode))
                    .concat("\u0020millions");
        }
        return result;
    }
}