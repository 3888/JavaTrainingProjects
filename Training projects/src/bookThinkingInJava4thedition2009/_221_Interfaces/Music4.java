package bookThinkingInJava4thedition2009._221_Interfaces;

/**
 * Created by 3888 on 06.11.2016.
 */
public class Music4{
    // ������ ������ �� ������� �� ������������ ���� �������.
        // ������� ����, ����������� � �������, ����� �������� ���������:
        static void tune(Instrument i) {
            // ...
            i.play(Note.MIDDLE_C);
        }
        static void tuneAll(Instrument[] e) {
            for(Instrument i : e)
                tune(i);
        }
        public static void main(String[] args) {
            // ���������� �������������� ��� ���������� � ������
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