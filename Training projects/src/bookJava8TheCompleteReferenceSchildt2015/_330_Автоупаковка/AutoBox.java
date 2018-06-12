package bookJava8TheCompleteReferenceSchildt2015._330_Автоупаковка;

public class AutoBox {
    public static void main(String[] args) {
//        Integer iOb = new Integer(100);
        Integer iOb = 100;

        int i = iOb;
        System.out.println(i);
    }
}

//    Primitive type 	Wrapper class
//     -> Autoboxing: Automatic conversion of primitive types to the object of
//      their corresponding wrapper classes is known as autoboxing.
//      For example – conversion of int to Integer, long to Long, double to Double etc.

//     <- Unboxing: It is just the reverse process of autoboxing. Automatically
//     converting an object of a wrapper class to its corresponding primitive type
//     is known as unboxing. For example – conversion of Integer to int, Long to long,
//     Double to double etc.

//        boolean	    Boolean
//        byte	        Byte
//        char	        Character
//        float	        Float
//        int	        Integer
//        long	        Long
//        short	        Short
//        double	    Double
