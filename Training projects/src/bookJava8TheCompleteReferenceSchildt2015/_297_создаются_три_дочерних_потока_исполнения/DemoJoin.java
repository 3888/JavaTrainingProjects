package bookJava8TheCompleteReferenceSchildt2015._297_создаются_три_дочерних_потока_исполнения;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread newThread = new NewThread("Один");
        NewThread newThread1 = new NewThread("Два");
        NewThread newThread2 = new NewThread("Три");

//        Определить, был ли поток исполнения завершен, можно двумя способами. Во­
//        первых, для этого потока можно вызвать метод isAlive()

        System.out.println("Поток " + newThread.thread.getName() + " запущен " + newThread.thread.isAlive());
        System.out.println("Поток " + newThread1.thread.getName() + " запущен " + newThread1.thread.isAlive());
        System.out.println("Поток " + newThread2.thread.getName() + " запущен " + newThread2.thread.isAlive());

        try { // ожидать завершения потоков исполнения

//        метод join() применяется, чтобы дождаться завершения потока исполнения.

            System.out.println("Ожидать завершения потоков");
            newThread.thread.join();
            newThread1.thread.join();
            newThread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        System.out.println("Поток " + newThread.thread.getName() + " запущен " + newThread.thread.isAlive());
        System.out.println("Поток " + newThread1.thread.getName() + " запущен " + newThread1.thread.isAlive());
        System.out.println("Поток " + newThread2.thread.getName() + " запущен " + newThread2.thread.isAlive());

        System.out.println("Глaвный поток завершен");
    }
}