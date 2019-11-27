package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            q.get();
    }
}
