package books.bookJava8TheCompleteReferenceSchildt2015._1016_CountDownLatch;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1016_CountDownLatch.MyThread;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(3); // try other value from 1 to 5
        new MyThread(cdl);
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All done!");
    }
}