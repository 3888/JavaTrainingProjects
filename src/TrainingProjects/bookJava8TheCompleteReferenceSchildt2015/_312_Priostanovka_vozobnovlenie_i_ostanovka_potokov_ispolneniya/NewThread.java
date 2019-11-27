package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya;

// ѕриостановка и возобновление исполнения потока современным способом
class NewThread implements Runnable {
    String name; // имя потока исполнения
    Thread t;
    boolean suspendFlag;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Ќовый поток: " + t);
        suspendFlag = false;
        t.start(); // запустить поток исполнения
    }

    // “очка входа в поток исполнения
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }


    synchronized void suspend() {
        suspendFlag = true;
    }

    synchronized void resume() {
        suspendFlag = false;
        notify();
    }
}
