package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1016_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    private CountDownLatch latch;

    MyThread(CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        }
    }
}