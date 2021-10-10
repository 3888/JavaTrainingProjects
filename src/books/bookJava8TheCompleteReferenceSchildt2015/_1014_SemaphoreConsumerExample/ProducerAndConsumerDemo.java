package books.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample;


public class ProducerAndConsumerDemo {
    public static void main(String args[]) {
     Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}