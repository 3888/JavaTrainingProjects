package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample;

import java.util.concurrent.Semaphore;

// Поток исполнения, уменьшающий значение счетчика на единицу
class DecThread implements Runnable {
    String name;
    Semaphore sem;

    DecThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Зaпycк потока: " + name);
        try {
            // сначала получить разрешение
            System.out.println("Пoтoк " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Пoтoк " + name + " получает разрешение");
            // а теперь получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                SharedRes.count--;
                System.out.println(name + " : " + SharedRes.count);
                // разрешить, если возможно, переключение контекста
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        // освободить разрешение
        System.out.println("Пoтoк " + name + " освобождает разрешение");
        sem.release();
    }
}
