package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._293_sozdanie_i_pusk_novogo_potoka_na_vypolnenie;


public class ThreadDemo {
    public static void main(String args[]) {
        new NewThread_implement_Runnable();   // создать  новый поток
        new NewThread_exetends_Thread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("√лавный поток:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("√лавный поток прерван.");
        }
        System.out.println("√лавный поток завершен.");
    }
}
