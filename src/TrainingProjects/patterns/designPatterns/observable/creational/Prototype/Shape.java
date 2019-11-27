package TrainingProjects.patterns.designPatterns.observable.creational.Prototype;

public abstract class Shape implements Cloneable {

    private String id;
    //    protected String type;
    String type;

    abstract void draw();

    //    public String getType() {
    String getType() {
        return type;
    }

    //    public String getId() {
    String getId() {
        return id;
    }

    //    public void setId(String id) {
    void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}