package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._293_sozdanie_i_pusk_novogo_potoka_na_vypolnenie;

class NewThread_implement_Runnable implements Runnable {
    private String threadName = "Дочерний поток implements Runnable";
    Thread t;

    NewThread_implement_Runnable() {
// создать новый, второй поток исполнения

//        В этом конструкторе параметр объект_потока обозначает экземпляр класса, реализующего интерфейс Runnable.
//        Этим определяется место, где начинается выполнение потока. Имя нового потока исполнения передается данному
//        конструктору в качестве параметра имя_потока .

        t = new Thread(this, "Демонстрационный поток implements Runnable");
        System.out.println(threadName + " создан: " + t);
        t.start(); // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println( threadName + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " прерван.");
        }
        System.out.println(threadName + " завершен.");
    }
}

