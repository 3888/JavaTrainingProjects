package books.bookThinkingInJava4thedition2009._221_Interfaces;

import todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces.Instrument;
import todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces.Note;

/**
 * Created by 3888 on 06.11.2016.
 */
public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    public String what() { return "Wind"; }
    public void adjust() {}
}