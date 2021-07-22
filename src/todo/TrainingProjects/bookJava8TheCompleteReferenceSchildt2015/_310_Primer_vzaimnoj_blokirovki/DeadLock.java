package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._310_Primer_vzaimnoj_blokirovki;

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Tread name Main");
        Thread t = new Thread(this, "Thread which rival with Tread name Main");
        t.start();
        a.foo(b);   // получить блокировку для объекта а в этом потоке исполнения
System.out.println("Back to Tread name Main");
    }

    public void run() {
        b.bar(a);   // получить  блокировку для объекта b в другом потоке исполнения
        System.out.println("Back to other thread");
    }

    public static void main(String args[]) {
        new Deadlock();
    }
}
