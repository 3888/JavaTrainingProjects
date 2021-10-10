package books.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Figure;

/**
 * Created by 3888 on 24.05.2016.
 */
public class Triangle extends todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes.Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area () для прямоугольного треугольника
    double area() {
        System.out.println(" B области трехугольника. ");
        return dim1 * dim2 / 2  ;
    }
}
