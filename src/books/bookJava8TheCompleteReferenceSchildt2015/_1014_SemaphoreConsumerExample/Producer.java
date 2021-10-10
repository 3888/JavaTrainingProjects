package books.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample.Q;

public class Producer implements Runnable {
    todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample.Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            q.put(i);
    }
}