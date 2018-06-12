package bookThinkingInJava4thedition2009._221_Interfaces;

/**
 * Created by 3888 on 06.11.2016.
 */
public class Music4{
    // Работа метода не зависит от фактического типа объекта.
        // поэтому типы, добавленные в систему, будут работать правильно:
        static void tune(Instrument i) {
            // ...
            i.play(Note.MIDDLE_C);
        }
        static void tuneAll(Instrument[] e) {
            for(Instrument i : e)
                tune(i);
        }
        public static void main(String[] args) {
            // Восходящее преобразование при добавлении в массив
            Instrument[] orchestra = {
                    new Wind(),
                    new Percussion(),
                    new Stringed(),
                    new Brass(),
                    new Woodwind()
            };
            tuneAll(orchestra);

        }
}