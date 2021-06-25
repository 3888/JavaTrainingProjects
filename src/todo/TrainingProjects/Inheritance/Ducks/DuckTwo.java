package todo.TrainingProjects.Inheritance.Ducks;

/**
 * Created by 3888 on 29.04.2015.
 */
public class DuckTwo extends BaseDuck{

    protected DuckTwo(float size, int colour, int sound) {
        super(size, colour, sound);
    }

    @Override
    boolean canQuack() {
        return false;
    }

    @Override
    boolean canFly() {
        return true;
    }
}
