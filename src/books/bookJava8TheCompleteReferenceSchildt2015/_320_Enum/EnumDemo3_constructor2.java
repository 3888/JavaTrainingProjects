package books.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Apple_constructor;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Apple_constructor2;

public class EnumDemo3_constructor2 {
    public static void main(String[] args) {

// вывести цену на яблоко сорта Winesap
        System.out.println("яблоко сорта Winesap стоит " + Apple_constructor.Winesap.getPrice() +
                "   центов.\n");

//   вывести иены на все сорта яблок
        System.out.println("÷ены на все сорта яблок:");
        for (todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Apple_constructor2 a : Apple_constructor2.values())
            System.out.println(a + "   стоит  " + a.getPrice() + "   центов. ");

//     эта программа выводит следующий результат:

//        яблоко сорта Winesap стоит 15   центов.
//
//                ÷ены на все сорта яблок:
//                Jonathan   стоит  10   центов.
//                GoldenDel   стоит  9   центов.
//                RedDel   стоит  -1   центов.
//                Winesap   стоит  15   центов.
//                Cortland   стоит  8   центов.

    }
}
