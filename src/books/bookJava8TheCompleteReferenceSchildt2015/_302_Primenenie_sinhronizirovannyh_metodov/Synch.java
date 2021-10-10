package books.bookJava8TheCompleteReferenceSchildt2015._302_Primenenie_sinhronizirovannyh_metodov;


public class Synch {

    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");


        try { // ожидать завершения потоков исполнения

            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
