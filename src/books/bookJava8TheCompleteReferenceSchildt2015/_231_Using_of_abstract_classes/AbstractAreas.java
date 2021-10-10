package books.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Figure;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Rectangle;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Triangle;

class AbstractAreas {
    public static void main(String args[]) {
//        Square f = new Square(10, 10); // Теперь недопустимо
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Rectangle r = new Rectangle(9, 5);
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Triangle t = new Triangle(10, 8);
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Figure figref; // верно, но объект не создается

        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}
