package bookJava8TheCompleteReferenceSchildt2015._228_Применение_переопределения_методов;

/**
 * Created by 3888 on 24.05.2016.
 */
public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area () для прямоугольного треугольника
    double area() {
        System.out.println(" B области трехугольника. ");
        return dim1 * dim2 / 2  ;
    }
}
