package TrainingProjects.tutorials.String;

import java.util.Random;

public class Oracle_FormattingNumericPrintOutput {
    public static void main(String[] args) {
//        https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
//        https://dzone.com/articles/java-string-format-examples


        Random random = new Random();

        String s1 = "Rainbow";
        int x = random.nextInt(100);

        System.out.printf("%-15s%03d\n", s1, x);
        System.out.format("%-15s%03d\n", s1, x);


    }
}
