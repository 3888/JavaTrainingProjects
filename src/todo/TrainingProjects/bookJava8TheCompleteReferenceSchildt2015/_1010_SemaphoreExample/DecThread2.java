package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample;

import java.util.concurrent.Semaphore;

public class DecThread2 implements Runnable {

    String name;
    Semaphore semaphore;

    DecThread2(Semaphore semaphore, String treadName){
        this.semaphore = semaphore;
        name = treadName;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try{
            System.out.println("Thread " + name + " waiting to begin");
            semaphore.acquire();
            System.out.println("Tread " + name + "get permission");

            for (int i = 0; i <= 5; i++){
                System.out.println(name + " : " + SharedRes.count--);

                System.out.println("Thread go to sleep");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " check out resource");
        semaphore.release();
    }
}