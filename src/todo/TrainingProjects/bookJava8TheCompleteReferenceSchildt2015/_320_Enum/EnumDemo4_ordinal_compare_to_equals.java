package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

public class EnumDemo4_ordinal_compare_to_equals {
    public static void main(String[] args) {
//   получить   все  порядковые   значения  с  помощью метода  ordinal()

        Apple ap, ap2, ap3;

        System.out.println("Bce константы сортов яблок " + " и их порядковые значения: ");

        for (Apple a : Apple.values())
            System.out.println(a + "   " + a.ordinal());
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
//   продемонстрировать  применение методов compareTo()   и equals()
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + "   предшествует  " + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + "  предшествует   " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + "   равно  " + ap3);
        System.out.println();
        if (ap.equals(ap2))
            System.out.println("ошибка ! ");
        if (ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);
        if (ap == ap3)
            System.out.println(ap + " ==  " + ap3);


//     Эта программа выводит следующий результат:

//        Bce константы сортов яблок  и их порядковые значения:
//        Jonathan   0
//        GoldenDel   1
//        RedDel   2
//        Winesap   3
//        Cortland   4
//
//        GoldenDel  предшествует   RedDel
//        RedDel   равно  RedDel
//
//        RedDel равно RedDel
//        RedDel ==  RedDel
    }
}
