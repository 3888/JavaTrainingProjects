package TrainingProjects.tutorials.Multithreading.Thread_Status;
// https://www.tutorialspoint.com/javaexamples/thread_status.htm

public class Main {
    public static void main(String args[]) throws Exception {
        int i = 0;
        MyThread thread = new MyThread();
        thread.setName("MyThread #1");
        showThreadStatus(thread);

        thread.start();
        Thread.sleep(50);
        showThreadStatus(thread);

        thread.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thread);

        thread.notice();
        Thread.sleep(50);
        showThreadStatus(thread);

        while (thread.isAlive()) {
            System.out.println("alive");
            showThreadStatus(thread);
        }
    }

    private static void showThreadStatus(Thread thread) {
        System.out.println(thread.getName() + " Alive:" + thread.isAlive() + " State:" + thread.getState());
    }
}

