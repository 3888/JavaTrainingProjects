package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._308_Vzaimodejstvie_potokov_ispolneniya;


public class Consumer implements Runnable {
        Q_sinhroniziruemya_ochered q;
//    A q;

        Consumer(Q_sinhroniziruemya_ochered q) {
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
