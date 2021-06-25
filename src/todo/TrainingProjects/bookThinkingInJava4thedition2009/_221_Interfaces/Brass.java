package todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces;


/**
 * Created by 3888 on 06.11.2016.
 */
public class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}