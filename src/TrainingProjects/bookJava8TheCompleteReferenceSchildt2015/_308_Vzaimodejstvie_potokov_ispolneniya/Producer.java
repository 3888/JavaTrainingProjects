package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._308_Vzaimodejstvie_potokov_ispolneniya;


public class Producer implements Runnable {
    Q_sinhroniziruemya_ochered q;
//    A q;

    Producer(Q_sinhroniziruemya_ochered q) {
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
