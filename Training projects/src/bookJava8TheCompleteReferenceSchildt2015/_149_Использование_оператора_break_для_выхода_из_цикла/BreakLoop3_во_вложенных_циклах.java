package bookJava8TheCompleteReferenceSchildt2015._149_Использование_оператора_break_для_выхода_из_цикла;

//  ѕрименение оператора break  во  вложенных  циклах
class BreakLoop3_во_вложенных_циклах {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("проход " + i + ":   ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;   //  выход из  цикла,   значение переменной j равно 10
                System.out.print(j + "   ");
            }
            System.out.println();
        }

        System.out.println("циклы завершены.");
    }
}