package material.multithreading;

public class TwoThreadsCallOneClass {

    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();

        Thread thread1 = new Thread("thread 1") {
            public void run() {
                System.out.println("Thread1 Running");
                someClass.first();
            }
        };
        thread1.start();

        Thread thread2 = new Thread("thread 2") {
            public void run() {
                System.out.println("Thread2 Running");
                someClass.second();
            }
        };
        thread2.start();
    }

    private static class SomeClass {

        synchronized void first() {
            System.out.println("first");
        }

        synchronized void second() {
            System.out.println("second");
        }

    }

}
