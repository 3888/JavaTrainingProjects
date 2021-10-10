package books.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample.DecThread;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample.IncThread;

import java.util.concurrent.Semaphore;

class SemaphorDemo {
    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);

        new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample.IncThread(sem, "А");
        new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample.DecThread(sem, "В");
    }
}

