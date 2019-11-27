package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._310_Primer_vzaimnoj_blokirovki;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Вошел в метод A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Клacc A прерван");
        }
        System.out.println(name + "пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("B Mетоде A.last()");
    }
}