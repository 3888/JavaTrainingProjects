package books.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample.Consumer;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample.Producer;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample.Q;

public class ProducerAndConsumerDemo {
    public static void main(String args[]) {
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample.Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}