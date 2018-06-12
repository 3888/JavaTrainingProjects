package inheritance.Ducks;

//+ Реализовать класс утка. Утки отличаются по размеру, цвету оперения, звуку кряканья.
//+ Причем некоторые утки не умеют крякать вообще, некоторые не умеют летать, но все умеют плавать
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
