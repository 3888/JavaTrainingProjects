package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

class EnumDemo1_switch {
    public static void main(String args[]) {
        Apple ap;
        ap = Apple.RedDel;

//  вывести  значение  перечислимого типа
        System.out.println("Zначение  ар:   " + ap);
        System.out.println();
        ap = Apple.GoldenDel;

//  сравнить  два  значения  перечисляемого типа
//
        if (ap == Apple.GoldenDel)
            System.out.println("переменная   ар  содержит  GoldenDel.\n");

//  применить   перечисление   для  управления оператором switch
        switch (ap) {
            case Jonathan:
                System.out.println("Сорт  Jonathan  красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden  Delicious  желтый.");
                break;
            case RedDel:
                System.out.println("Сорт  Red   Delicious   красный.");
                break;
            case Winesap:
            System.out.println("Copт Winesap  красный.");
            break;
            case Cortland:
                System.out.println("Сорт Cortland  красный.");
                break;
        }
    }
}

//    эта программа
//    выводит следующий результат:
//        aр : RedDel
//        ѕеременная ар содержит GoldenDel.
//      Сорт Golden Delicious желтый.
