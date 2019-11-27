package TrainingProjects.tutorials.thread_status;
// https://www.tutorialspoint.com/javaexamples/thread_status.htm

public class Main {
    public static void main(String args[]) throws Exception {
        int i = 0;
        MyThread thrd = new MyThread();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);

        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);

        while (thrd.isAlive()) {

            System.out.println("alive");
            showThreadStatus(thrd);
        }
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive:" + thrd.isAlive() + " State:" + thrd.getState());
    }
}
