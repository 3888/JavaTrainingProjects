package books.bookJava8TheCompleteReferenceSchildt2015._231_Using_of_abstract_classes;


/**
 * Created by 3888 on 24.05.2016.
 */
public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area () для четырехугольника
    double area() {
        System.out.println(" B области четырехугольника. ");
        return dim1 * dim2;
    }
}
