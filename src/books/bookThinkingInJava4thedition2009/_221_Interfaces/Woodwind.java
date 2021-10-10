package books.bookThinkingInJava4thedition2009._221_Interfaces;


/**
 * Created by 3888 on 06.11.2016.
 */
public class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }
}