package todo.TrainingProjects.Inheritance.Ducks;


public class Main {


    public static void main(String args[]) {

DuckOne duckOne = new DuckOne(1,1,1);
        System.out.println("Duck one can swim " + duckOne.CAN_SWIM);
        System.out.println("Duck one can fly " + duckOne.canFly());
        System.out.println("Duck one can quack " + duckOne.canQuack());


        DuckTwo duckTwo = new DuckTwo(1,1,1);
        System.out.println("Duck two can swim " + duckTwo.CAN_SWIM);
        System.out.println("Duck two can fly " + duckTwo.canFly());
        System.out.println("Duck two can quack " + duckTwo.canQuack());

    }
}
