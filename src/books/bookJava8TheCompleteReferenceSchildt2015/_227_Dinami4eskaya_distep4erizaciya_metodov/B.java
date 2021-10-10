package books.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov.A;

/**
 * Created by 3888 on 20.05.2016.
 */
public class B extends A {
    @Override
    void callMe() {
        System.out.println("В методе callMe() из класса " + getClass().getSimpleName());
    }
}
