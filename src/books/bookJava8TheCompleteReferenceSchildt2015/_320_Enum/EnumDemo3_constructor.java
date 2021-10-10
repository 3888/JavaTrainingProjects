package books.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Apple_constructor;

public class EnumDemo3_constructor {
    public static void main(String[] args) {
// вывести цену на яблоко сорта Winesap
        System.out.println("яблоко сорта Winesap стоит " + todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Apple_constructor.Winesap.getPrice() +
                "   центов.\n");

//   вывести иены на все сорта яблок
        System.out.println("÷ены на все сорта яблок:");
        for (todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Apple_constructor a : Apple_constructor.values())
            System.out.println(a + "   стоит  " + a.getPrice() + "   центов. ");

//     Эта программа выводит следующий результат:

//        яблоко сорта Winesap стоит 15   центов.
//
//                Цены на все сорта яблок:
//                Jonathan   стоит  10   центов.
//                GoldenDel   стоит  9   центов.
//                RedDel   стоит  12   центов.
//                Winesap   стоит  15   центов.
//                Cortland   стоит  8   центов.
    }
}
