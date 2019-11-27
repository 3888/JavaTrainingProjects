package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes;

class AbstractAreas {
    public static void main(String args[]) {
//        Square f = new Square(10, 10); // Теперь недопустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // верно, но объект не создается

        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}
