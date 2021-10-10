package books.bookJava8TheCompleteReferenceSchildt2015._297_sozdayutsya_tri_dochernih_potoka_ispolneniya;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._297_sozdayutsya_tri_dochernih_potoka_ispolneniya.NewThread;

public class MultiThreadDemo {
    public static void main(String[] args) {
//        boolean running = true;
        new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._297_sozdayutsya_tri_dochernih_potoka_ispolneniya.NewThread("1-й"); // запустить потоки на исполнение
        new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._297_sozdayutsya_tri_dochernih_potoka_ispolneniya.NewThread("2-й");
        new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._297_sozdayutsya_tri_dochernih_potoka_ispolneniya.NewThread("3-й");

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