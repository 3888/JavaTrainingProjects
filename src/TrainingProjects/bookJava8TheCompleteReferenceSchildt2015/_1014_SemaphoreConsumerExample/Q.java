package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1014_SemaphoreConsumerExample;

import java.util.concurrent.Semaphore;

public class Q {
    int n;
    // начать с недоступного семафора потребителя
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        System.out.println("Пoлyчeнo: " + n);
        semProd.release();
    }

    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException е) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        this.n = n;
        System.out.println("Oтпpaвлeнo: " + n);
        semCon.release();
    }
}
