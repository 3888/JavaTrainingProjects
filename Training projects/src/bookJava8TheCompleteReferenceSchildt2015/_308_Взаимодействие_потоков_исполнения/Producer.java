package bookJava8TheCompleteReferenceSchildt2015._308_Взаимодействие_потоков_исполнения;


public class Producer implements Runnable {
    Q_синхронизируемя_очередь q;
//    A q;

    Producer(Q_синхронизируемя_очередь q) {
//        Producer(A q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        int i = 0;
        while  (i < 5)
//            while (true)
        {
            q.put(i++);
        }
    }
}
