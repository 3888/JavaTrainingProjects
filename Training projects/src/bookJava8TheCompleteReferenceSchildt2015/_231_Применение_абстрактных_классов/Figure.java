package bookJava8TheCompleteReferenceSchildt2015._231_Применение_абстрактных_классов;

// Применение полиморфизма во время выполнения
abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}