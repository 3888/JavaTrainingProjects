package bookThinkingInJava4thedition2009._221_Interfaces;

/**
 * Created by 3888 on 06.11.2016.
 */
abstract class Instrument {
    private int i; // ������ ���������� ��� ������� �������
    public abstract void play(Note n);
    public String what() { return "Instrument"; }
    public abstract void adjust();
}