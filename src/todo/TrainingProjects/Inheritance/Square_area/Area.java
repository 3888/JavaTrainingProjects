package todo.TrainingProjects.Inheritance.Square_area;

public class Area {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSizeA(2);

        System.out.println("square area = " + square.calculateSquare());

        Rectangle rectangle = new Rectangle();
        rectangle.setSizeA(8);
        rectangle.setSizeB(7);

        System.out.println("rectangle area = " + rectangle.calculateSquare());
    }
}