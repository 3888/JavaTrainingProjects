package books.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample;


import java.util.concurrent.Semaphore;

class SemaphorDemo {
    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "А");
        new DecThread(sem, "В");
    }
}

