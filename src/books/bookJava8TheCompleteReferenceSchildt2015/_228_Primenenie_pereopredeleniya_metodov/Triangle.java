package books.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Figure;

/**
 * Created by 3888 on 24.05.2016.
 */
public class Triangle extends todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area () для прямоугольного треугольника
    double area() {
        System.out.println(" B области трехугольника. ");
        return dim1 * dim2 / 2  ;
    }
}