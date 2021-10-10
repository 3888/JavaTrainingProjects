package books.bookJava8TheCompleteReferenceSchildt2015._1019_Exchanger;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1019_Exchanger.MakeString;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._1019_Exchanger.UsesString;

import java.util.concurrent.Exchanger;

public class ExgrDemo {

    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();

        new UsesString(exgr);
        new MakeString(exgr);
    }
}
