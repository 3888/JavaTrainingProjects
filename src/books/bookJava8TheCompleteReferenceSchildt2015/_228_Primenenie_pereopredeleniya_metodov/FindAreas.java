package books.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Figure;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Rectangle;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Triangle;

class FindAreas {
    public static void main(String args[]) {
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Figure f = new todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Triangle t = new Triangle(10, 8);
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._228_Primenenie_pereopredeleniya_metodov.Figure figref;
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());
        figref = f;
        System.out.println("Площадь равна " + figref.area());
    }
}
