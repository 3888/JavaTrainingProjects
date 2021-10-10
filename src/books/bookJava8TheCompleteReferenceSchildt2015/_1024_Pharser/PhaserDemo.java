package books.bookJava8TheCompleteReferenceSchildt2015._1024_Pharser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String args[]) {
        Phaser phaser = new Phaser(1); // колличество сторон

        System.out.println("запуск потоков");

        int cycleCount = 3;
        for (int i = 0; i < cycleCount; i++) {
            int aSCIIcode = 65;
            new PhaserThread(phaser, (aSCIIcode + i));
        }

        for (int i = 0; i < cycleCount; i++) {
            getPhase(phaser);
        }

//        new PhaserThread(phaser, "А");
//        new PhaserThread(phaser, "В");
//        new PhaserThread(phaser, "С");

        // ожидать завершения всеми потоками исполнения первой фазы
//        curPhase = phaser.getPhase() + 1;
//        phaser.arriveAndAwaitAdvance();
//        System.out.println("Фaзa " + curPhase + " завершена");

        // ожидать завершения всеми потоками исполнения второй фазы
//        curPhase = phaser.getPhase() + 1;
//        phaser.arriveAndAwaitAdvance();
//        System.out.println("Фaзa " + curPhase + " завершена");

        // ожидать завершения всеми потоками исполнения третей фазы
//        curPhase = phaser.getPhase() + 1;
//        phaser.arriveAndAwaitAdvance();
//        System.out.println("Фaзa " + curPhase + " завершена");

        // снять основной поток исполнения с регистрации
        phaser.arriveAndDeregister();

        if (phaser.isTerminated())
            System.out.println("Cинxpoнизaтop фаз завершен");
    }

    private static void getPhase(Phaser phaser) {
        phaser.arriveAndAwaitAdvance(); // известить о достижении фазы
        System.out.println("Фaзa " + phaser.getPhase() + " завершена");
    }
}

// Поток исполнения, использующий синхронизатор фаз типа Phaser
class PhaserThread implements Runnable {
    private Phaser phsr;
    private String name;

    PhaserThread(Phaser р, int aSCIIcode) {
        phsr = р;
        name = Character.toString((char) aSCIIcode);
        phsr.register();
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            startPhase();
        }

//        System.out.println("Пoтoк " + name + " начинает " + (phsr.getPhase() + 1)
//                + " фазу");
//        phsr.arriveAndAwaitAdvance(); // известить о достижении фазы
//
//        // Небольшая пауза, чтобы не нарушить порядок вывода.
//        // Только для иллюстрации, но необязательно для правильного
//        // функционирования синхронизатора фаз
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }

//        System.out.println("Пoтoк " + name + " начинает " + (phsr.getPhase() + 1)
//                + " фазу");
//        phsr.arriveAndAwaitAdvance(); // известить о достижении фазы
//        // Небольшая пауза, чтобы не нарушить порядок вывода.
//        // Только для иллюстрации, но необязательно для правильного
//        // функционирования синхронизатора фаз
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }

//        System.out.println("Пoтoк " + name + " начинает " + (phsr.getPhase() + 1)
//                + " фазу");
//        phsr.arriveAndDeregister();// известить о достижении фазы и
//        // снять потоки с регистрации
    }

    private void startPhase() {
        System.out.println("Пoтoк " + name + " начинает " + (phsr.getPhase() + 1)
                + " фазу");

        phsr.arriveAndAwaitAdvance(); // известить о достижении фазы

        // Небольшая пауза, чтобы не нарушить порядок вывода.
        // Только для иллюстрации, но необязательно для правильного
        // функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}