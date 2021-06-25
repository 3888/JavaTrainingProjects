package todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces;

/**
 * Created by 3888 on 06.11.2016.
 */
public class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    public String what() { return "Stringed"; }
    public void adjust() {}
}
