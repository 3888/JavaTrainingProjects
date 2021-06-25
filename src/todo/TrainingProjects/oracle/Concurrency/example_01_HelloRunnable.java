package todo.TrainingProjects.oracle.Concurrency;

public class example_01_HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new example_01_HelloRunnable())).start();
    }

}