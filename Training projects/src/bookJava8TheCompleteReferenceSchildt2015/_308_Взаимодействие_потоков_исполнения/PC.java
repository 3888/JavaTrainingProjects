package bookJava8TheCompleteReferenceSchildt2015._308_Взаимодействие_потоков_исполнения;

class PC {
    public static void main(String args[]) {
//        A q = new A();
        Q_синхронизируемя_очередь q = new Q_синхронизируемя_очередь();

        new Producer(q);
        new Consumer(q);
//        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}