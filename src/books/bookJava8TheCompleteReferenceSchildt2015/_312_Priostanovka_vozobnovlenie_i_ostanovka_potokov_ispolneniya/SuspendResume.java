package books.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya;


import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya.NewThread;

class SuspendResume {
    public static void main(String args[]) {
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya.NewThread ob1 = new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya.NewThread("Один");
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya.NewThread ob2 = new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._312_Priostanovka_vozobnovlenie_i_ostanovka_potokov_ispolneniya.NewThread("Два");
        try {
            Thread.sleep(1000);
            ob1.suspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.resume();
            System.out.println("Возобновление потока Один");
            ob2.suspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.resume();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
// ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e)

        {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}
