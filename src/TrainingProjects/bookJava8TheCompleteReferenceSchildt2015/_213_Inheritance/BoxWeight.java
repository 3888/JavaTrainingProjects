package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._213_Inheritance;

// расширить класс Box, включив в него поле веса
public class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    // Теперь  в классе BoxWeight  ключевое слово super  используется для инициализации
    // собственных свойств объекта типа Box



}


