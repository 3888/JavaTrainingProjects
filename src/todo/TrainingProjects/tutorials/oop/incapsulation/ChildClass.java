package todo.TrainingProjects.tutorials.oop.incapsulation;

public class ChildClass extends BaseClass {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        baseClass.methodOverloading();

        BaseClass.method();
        BaseClass.method(""); // Overloaded
    }

    @Override
    protected void methodOverloading() { // Overriding
        super.methodOverloading();
    }
}
