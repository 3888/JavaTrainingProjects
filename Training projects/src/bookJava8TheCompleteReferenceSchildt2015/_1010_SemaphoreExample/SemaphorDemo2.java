package bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample;

import java.util.concurrent.Semaphore;

public class SemaphorDemo2 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new IncThread2(semaphore, "First");
        new DecThread2(semaphore, "Second");
    }
}
