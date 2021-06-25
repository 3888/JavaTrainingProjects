package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._153_Primenenie_continue_s_metkoj_obemlyushchego_cikla_dlya_vyvoda_treugolnoj_tablicy_umnozheniya;

import java.util.Scanner;

public class ContinueLabel {

//    Как и оператор break, оператор continue может содержать метку объемлюще­
//    го цикла, который нужно продолжить. Ниже приведен пример программы, в ко­
//    торой оператор continue применяется для вывода треугольной таблицы умноже­
//    ния чисел от О до 9.


    // Применение оператора continue с меткой
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 10;
        outer:
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
//                System.out.print("#");
            }
        } System.out.println();
    }
}
