package books.bookJava8TheCompleteReferenceSchildt2015._302_Primenenie_sinhronizirovannyh_metodov;


class Callme {

    void call(String msg) {

    //    Этим предотвращается доступ к методу call() из других потоков исполнения,
//    когда он уже используется в одном потоке.

//    synchronized void call(String msg) { // нифига! есть сбои

        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }

}
