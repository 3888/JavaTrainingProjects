package books.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1010_SemaphoreExample.SharedRes;

import java.util.concurrent.Semaphore;

public class IncThread2 implements Runnable {

    String name;
    Semaphore semaphore;

    IncThread2(Semaphore semaphore, String threadName){
        this.semaphore = semaphore;
        name = threadName;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try{
            System.out.println("Thread " + name + " waiting to begin");
            semaphore.acquire();
            System.out.println("Tread " + name + "get permission");

            for (int i = 0; i < 5; i++){
                System.out.println(name + " : " + SharedRes.count++);

                //Если есть метод, освобождающий ресурс semaphore.release(), то
                //метод sleep() не даст возможности запуститься второму потоку,
                //а если метода, освобождающего СЕМАФОР нет, второй поток запустится
                // и первый уже не сможет возобновиться.
                System.out.println("Thread go to sleep");
                Thread.sleep(1000);

                //Если запустить метод wait(), то программа вылетит с ошибкой,
                //т.к. второй поток запустится и сделает попытку получить доступ
                //к ресурсу, в то время как ресурс занят.
                //Ошибка: java.lang.IllegalMonitorStateException
//                System.out.println("Thread go to wait");
//                wait(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " check out resource");
        semaphore.release();
    }
}
