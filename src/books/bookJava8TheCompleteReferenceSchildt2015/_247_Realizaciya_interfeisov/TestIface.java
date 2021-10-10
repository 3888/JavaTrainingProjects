package books.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov.Callback;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov.Client;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
