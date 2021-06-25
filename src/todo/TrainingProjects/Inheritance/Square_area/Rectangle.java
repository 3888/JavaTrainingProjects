package todo.TrainingProjects.Inheritance.Square_area;

public class Rectangle extends Square {

    public int getSizeB() {
        return sizeB;
    }

    public void setSizeB(int sizeB) {
        this.sizeB = sizeB;
    }

    int sizeB;

    @Override
    public int calculateSquare() {
        return sizeB * getSizeA() ;
    }
}
