package material.String;

public class Oracle_FormattingNumericPrintOutput {
    public static void main(String[] args) {
//        https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
//        https://dzone.com/articles/java-string-format-examples
//        http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/

        long n = 461012;


//        System.out.println("Converter %d A decimal integer");
//        System.out.format("%d%n", n);      //  -->  "461012"

//        System.out.println("Flag 08 or 8 and Converter %d Eight characters in width, with leading zeroes if necessary");
//        System.out.format("%08d%n", n);    //  -->  "00461012"
//        System.out.format("%8d%n", n);    //  -->  "00461012"

//        System.out.println("Flag + and Converter %d Includes sign, whether positive or negative");
//        System.out.format("%+8d%n", n);    //  -->  " +461012"

//        System.out.println("Flag , and Flag %8 and Converter %d Includes locale-specific grouping characters");
//        System.out.format("%,10d%n", n);    // -->  " 461,012"
//        System.out.printf(Locale.ENGLISH,"%,d%n", 1000000 );// 1,000,000
//        System.out.printf(Locale.GERMAN,"%,d%n", 1000000 ); // 1.000.000
//        System.out.printf(Locale.FRANCE,"%,d%n", 1000000 ); // 1 000 000

//        System.out.println("Flag + and Flag , and Flag 9 or 8 and Converter %d and Converter %n and Converter %n ");
//        System.out.format("%+,9d%n%n", n); //  -->  "+461,012"
//        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

//        System.out.println("Converter %f A float");//
//        System.out.format("%f%n", pi);       // -->  "3.141593"

//        System.out.println("Flag .3 and Converter %f Three places after decimal point.");
//        System.out.format("%.3f%n", pi);     // -->  "3.142"

//        System.out.println("Flag 10 and Flag .3 and Converter %f  Ten  characters in width and Three places after decimal point.");
//        System.out.format("%10.3f%n", pi);   // -->  "     3.142"

        System.out.format("%-10.3f%n", pi);  // -->  "3.142"


//        System.out.format(Locale.FRANCE,
//                "%-10.4f%n%n", pi); // -->  "3,1416"
//
//        Calendar c = Calendar.getInstance();
//        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
//
//        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
//
//        System.out.format("%tD%n", c);    // -->  "05/29/06"
//


//        Random random = new Random();
//
//        String s1 = "Rainbow";
//        int x = random.nextInt(100);
//        System.out.printf("%-15s%03d%n", s1, x);
//        System.out.format("%-15s%03d%n", s1, x);


    }
}