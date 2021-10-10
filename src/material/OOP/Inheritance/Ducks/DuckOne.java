package material.OOP.Inheritance.Ducks;


public class DuckOne extends BaseDuck {

    protected DuckOne(float size, int colour, int sound) {
        super(size, colour, sound);
    }

    @Override
    boolean canQuack() {
        return true;
    }

    @Override
    boolean canFly() {
        return false;
    }
}
