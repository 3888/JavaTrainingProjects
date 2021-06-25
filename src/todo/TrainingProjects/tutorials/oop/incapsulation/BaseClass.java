package todo.TrainingProjects.tutorials.oop.incapsulation;

public class BaseClass {

    public static void method() {
        System.out.println("Hi");
    }

    public static void method(String string) { // Overloading
        System.out.println(string);
    }

    final void method (int value){ // can'not be Overriding
        System.out.println(value);
    }

    static void method (String string, int value){ // can'not be Overriding
        System.out.println(value);
    }
    protected void methodOverloading() {
        System.out.println("Hi");
    }

    private void methodOverloading(String string) { // Overloading
        System.out.println(string);
    }
}
