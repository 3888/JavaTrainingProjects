package books.bookJava8TheCompleteReferenceSchildt2015._293_sozdanie_i_pusk_novogo_potoka_na_vypolnenie;

class NewThread_exetends_Thread extends Thread {
    private String threadName = "Дочерний поток extends Thread";

    NewThread_exetends_Thread() {
// создать новый, второй поток исполнения
//        Обратите внимание
//        на метод super() в классе NewThread. Он вызывает конструктор Thread () , общая
//        форма которого приведена ниже , где параметр имя_потока обозначает имя порождаемого потока исполнения.

        super("Демонстрационный поток extends Thread");
        System.out.println(threadName + " создан: " + this);
        start(); // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " прерван.");
        }
        System.out.println(threadName + " завершен.");
    }
}

