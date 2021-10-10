package books.bookJava8TheCompleteReferenceSchildt2015._214_Peremennaya_superklassa_mojet_ssylatsya_na_obekt_podklassa;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._214_Peremennaya_superklassa_mojet_ssylatsya_na_obekt_podklassa.Box;

// расширить класс Box, включив в него поле веса
public class BoxWeight extends todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._214_Peremennaya_superklassa_mojet_ssylatsya_na_obekt_podklassa.Box {
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


    // инициализировать  поля width,   height и depth
// с помощью метода  super ()
//    BoxWeight(double w, double h, double d, double m) {
//        super(w, h, d);   // вызвать   конструктор суперкласса
//        weight = m;
//    }
}


