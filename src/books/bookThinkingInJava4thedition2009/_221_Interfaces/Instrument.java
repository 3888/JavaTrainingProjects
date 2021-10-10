package books.bookThinkingInJava4thedition2009._221_Interfaces;

import todo.TrainingProjects.bookThinkingInJava4thedition2009._221_Interfaces.Note;

/**
 * Created by 3888 on 06.11.2016.
 */
abstract class Instrument {
    private int i; // Память выделяется для каждого объекта
    public abstract void play(Note n);
    public String what() { return "Instrument"; }
    public abstract void adjust();
}