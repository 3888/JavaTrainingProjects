package books.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1.Protection;

/**
 * Created by 3888 on 25.05.2016.
 */
class Derived extends Protection {
    Derived() {
        System.out.println("конструктор подкласса " + getClass().getSimpleName());
        System.out.println("n = " + n);
// доступно только для класса
// System.out.println("n_pri = "4 + n_pri);
        System.out.println("n_pro = " + n_pro);

        System.out.println("n_pub = " + n_pub);
    }
}
