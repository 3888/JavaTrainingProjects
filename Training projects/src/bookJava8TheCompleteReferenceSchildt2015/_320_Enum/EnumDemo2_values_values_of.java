package bookJava8TheCompleteReferenceSchildt2015._320_Enum;

class EnumDemo2_values_values_of {
    public static void main(String args[]) {
        Apple ap;
        System.out.println("константы перечислимого типа Apple:");

// применить метод values()

//        Apple allapples[] = Apple.values();
//        for (Apple a : allapples)

// обратите внимание на то, что для перебора массива констант, возвращаемых методом values () ,
// в данной программе используется цикл for в стиле for each. ¬ целях демонстрации создается
// переменная allapples, которой присваивается ссылка на массив значений перечислимого типа.
// Но это совсем не обязательно, поскольку цикл for можно написать и без переменной allapples
// следующим образом:
        for (Apple a : Apple.values())
            System.out.println(a);
        System.out.println();

// применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("переменная ар содержит " + ap);
    }
}

//        Эта программа выводит следующий результат:
//         онстанты перечислимого типа Apple:
//        GoldenDel RedDel Winesap Cortland
//        переменная ар содержит Winesap
//


