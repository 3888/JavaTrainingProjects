package books.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov;


import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov.Callback;

public class Client implements Callback {

     //реализовать интерфейс callback
    public void callback(int p) {
        System.out.println(
                "Метод callback (), вызываемый со значением " + p);
    }

    void nonlfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы," +
                "могут определяться и другие члены.");
    }
}
