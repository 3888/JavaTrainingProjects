package bookJava8TheCompleteReferenceSchildt2015._297_создаются_три_дочерних_потока_исполнения;

public class MultiThreadDemo {
    public static void main(String[] args) {
//        boolean running = true;
        new NewThread("1-й"); // запустить потоки на исполнение
        new NewThread("2-й");
        new NewThread("3-й");

//        new NewThread("1-й", 5); // запустить потоки на исполнение + приоритеты
//        new NewThread("2-й", 10);
//        new NewThread("3-й", 1);
//        while (running) {
        try {
            // ожидать завершения других потоков исполнения
                Thread.sleep(3000);

//            Thread.sleep(1000);
//            Thread.interrupted();
//            running = false;
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        System.out.println("Глaвный поток завершен");
//        }
    }
}