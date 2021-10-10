package books.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov.AnotherClient;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov.Callback;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._247_Realizaciya_interfeisov.Client;

public class    TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);

        c = ob; //  теперь  переменная с ссылается на объект
               // типа  AnotherClient
        c.callback(42);

   }
}
