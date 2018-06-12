package bookJava8TheCompleteReferenceSchildt2015._149_Использование_оператора_break_для_выхода_из_цикла;

/**
 * Created by 3888 on 20.05.2016.
 */
// ѕрименение оператора break для выхода из цикла while
class BreakLoop2_из_цикла_while {
    public static void main(String args[]) {
        int i = 0;
        while (i < 100) {
            if (i == 10) break; // выход из цикла, если значен переменной i равно 10
 System.out.println("i: " + i); i++;
        }
        System.out.println("цикл завершен.");
    }
}
