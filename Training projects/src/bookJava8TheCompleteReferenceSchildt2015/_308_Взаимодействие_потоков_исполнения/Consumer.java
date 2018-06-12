package bookJava8TheCompleteReferenceSchildt2015._308_Взаимодействие_потоков_исполнения;


public class Consumer implements Runnable {
        Q_синхронизируемя_очередь q;
//    A q;

        Consumer(Q_синхронизируемя_очередь q) {
//    Consumer(A q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
            while (true) {
            q.get();
        }
    }
}
