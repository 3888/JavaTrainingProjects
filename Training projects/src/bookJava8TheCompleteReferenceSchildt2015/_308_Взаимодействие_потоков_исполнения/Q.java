package bookJava8TheCompleteReferenceSchildt2015._308_Взаимодействие_потоков_исполнения;

// Неравильная реализация поставщика и потребителя
class Q {
    int n;

    synchronized int get() {
        System.out.println("Получено: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Отправлено: " + n);
        notify();
    }
}
