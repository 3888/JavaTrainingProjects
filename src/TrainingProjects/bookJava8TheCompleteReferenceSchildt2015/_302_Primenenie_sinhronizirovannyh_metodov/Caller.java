package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._302_Primenenie_sinhronizirovannyh_metodov;

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

//    public void run() {
//        target.call(msg);
//    }

    //    синхронизированные вызовы метода call()
    // ))) Глючит!
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}