package books.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.javacodegeeks;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.javacodegeeks.Student;

import java.util.Comparator;

public class GradeComparator implements Comparator <todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.javacodegeeks.Student> {

    @Override
    public int compare(todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.javacodegeeks.Student o1, Student o2) {

        // descending order (ascending order would be:
        // o1.getGrade()-o2.getGrade())
        return o2.getGrade() - o1.getGrade();
    }

}