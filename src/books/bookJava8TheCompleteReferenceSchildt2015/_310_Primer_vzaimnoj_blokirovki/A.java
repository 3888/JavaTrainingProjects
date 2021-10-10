package books.bookJava8TheCompleteReferenceSchildt2015._310_Primer_vzaimnoj_blokirovki;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._310_Primer_vzaimnoj_blokirovki.B;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "Enter to A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A interupted");
        }
        System.out.println(name + "try to call  B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}