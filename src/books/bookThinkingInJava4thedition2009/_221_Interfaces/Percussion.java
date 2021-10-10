package books.bookThinkingInJava4thedition2009._221_Interfaces;

import todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces.Instrument;
import todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces.Note;

/**
 * Created by 3888 on 06.11.2016.
 */
public class Percussion extends todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces.Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    public String what() { return "Percussion"; }
    public void adjust() {}
}
