package bookJava8TheCompleteReferenceSchildt2015._149_Использование_оператора_break_для_выхода_из_цикла;

/**
 * Created by 3888 on 20.05.2016.
 */
public class BreakLoop {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // выход из цикла, если значение переменной i равно 10
 System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
