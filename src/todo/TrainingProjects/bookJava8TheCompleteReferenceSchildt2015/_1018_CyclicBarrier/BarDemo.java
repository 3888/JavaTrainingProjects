package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1018_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2, new BarAction());
        System.out.println("threads run");
        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
        new MyThread(cb, "X");
        new MyThread(cb, "Y");
        new MyThread(cb, "Z");
    }
}