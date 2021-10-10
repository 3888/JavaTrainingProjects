package books.bookJava8TheCompleteReferenceSchildt2015._310_Primer_vzaimnoj_blokirovki;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._310_Primer_vzaimnoj_blokirovki.A;

class B {
        synchronized void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Enter to method B.bar{)");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Class B interrupt");
            }
            System.out.println(name + "try to call A.last()");
            a.last();
        }

        synchronized void last() {
            System.out.println("In method A.last()");
        }



    }
