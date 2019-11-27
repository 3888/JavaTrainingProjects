package TrainingProjects.Inheritance.Square_area;

class Square {
    private int sizeA;

    public int getSizeA() {
        return sizeA;
    }

    public void setSizeA(int sizeA) {
        this.sizeA = sizeA;
    }

    public int calculateSquare() {
        return sizeA *= sizeA;
    }
}