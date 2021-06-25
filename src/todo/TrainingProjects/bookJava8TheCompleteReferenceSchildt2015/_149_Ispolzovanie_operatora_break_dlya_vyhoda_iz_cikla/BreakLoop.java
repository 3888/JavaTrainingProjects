package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._149_Ispolzovanie_operatora_break_dlya_vyhoda_iz_cikla;

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
