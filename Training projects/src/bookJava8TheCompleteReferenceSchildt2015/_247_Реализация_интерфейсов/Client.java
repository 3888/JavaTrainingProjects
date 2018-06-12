package bookJava8TheCompleteReferenceSchildt2015._247_Реализация_интерфейсов;


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
