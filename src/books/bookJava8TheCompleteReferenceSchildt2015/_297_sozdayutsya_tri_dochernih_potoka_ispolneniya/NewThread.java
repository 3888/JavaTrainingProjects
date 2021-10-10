package books.bookJava8TheCompleteReferenceSchildt2015._297_sozdayutsya_tri_dochernih_potoka_ispolneniya;

class NewThread implements Runnable {
    private String name; // имя потока исполнения
    Thread thread;


    NewThread(String threadName) {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("Area поток: " + thread);
           thread.start(); // запустить поток исполнения
    }

    NewThread(String threadName, int priority) {
        name = threadName;

        thread = new Thread(this, name);
        thread.setPriority(priority);
        System.out.println("Area поток: " + thread);
        thread.start(); // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}

