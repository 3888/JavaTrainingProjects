package bookJava8TheCompleteReferenceSchildt2015._228_Применение_переопределения_методов;

// Применение полиморфизма во время выполнения
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}