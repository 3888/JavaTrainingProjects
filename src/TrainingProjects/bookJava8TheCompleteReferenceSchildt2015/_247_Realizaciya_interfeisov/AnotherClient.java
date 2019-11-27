package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov;

//  ≈ще  одна реализация интерфейса
public class AnotherClient implements Callback {
    //  реализовать  интерфейс Callback
    public void callback(int p) {
        System.out.println("еще  один  вариант метода callback()");
        System.out.println("р в квадрате равно  " + (p * p));
    }
}


