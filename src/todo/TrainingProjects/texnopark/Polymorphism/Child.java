package todo.TrainingProjects.texnopark.Polymorphism;

class Child extends Parent {
    @Override
    void test() {
        System.out.println("Child");
    }

    void childBase() {
        System.out.println("childBase");
    }
}
