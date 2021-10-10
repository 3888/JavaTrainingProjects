package books.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1;


import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1.Derived;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1.Protection;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1.SamePackage;

//  получить  экземпляры различных   классов из  пакета p1
public class Demo {
    public static void main(String args[]) {
        Protection obi = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
