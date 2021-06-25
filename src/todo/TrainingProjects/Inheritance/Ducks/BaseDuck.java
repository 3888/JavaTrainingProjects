package todo.TrainingProjects.Inheritance.Ducks;

//+ ����������� ����� ����. ���� ���������� �� �������, ����� ��������, ����� ��������.
//+ ������ ��������� ���� �� ����� ������� ������, ��������� �� ����� ������, �� ��� ����� �������
public abstract class BaseDuck {

    protected final boolean CAN_SWIM = true;

    private float size;
    private int colour;
    private int sound;

    protected BaseDuck (float size, int colour, int sound)
                {
                    this.size = size;
                    this.colour = colour;
                    this.sound = sound;
    }

    abstract boolean canQuack ();
    abstract boolean canFly ();
}
