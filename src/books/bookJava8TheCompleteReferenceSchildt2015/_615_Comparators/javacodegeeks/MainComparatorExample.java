package books.bookJava8TheCompleteReferenceSchildt2015._615_Comparators.javacodegeeks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparatorExample {

    public static void main(String args[]) {

//        Student student[] = new Student[3];
//
//        student[0] = new Student();
//        student[0].setName("Nick");
//        student[0].setGrade(19);
//
//        student[1] = new Student();
//        student[1].setName("Helen");
//        student[1].setGrade(12);
//
//        student[2] = new Student();
//        student[2].setName("Ross");
//        student[2].setGrade(16);

//        ArrayList<Student> student = new ArrayList<Student>();

        List<Student> student = new ArrayList<Student>();

      Student data = Student.newBuilder()
                .setName("Ben")
                .setGrade(18)
                .build();

        student.add(data);

        data = Student.newBuilder()
                .setName("David")
                .setGrade(20)
                .build();

        student.add(data);

        data =Student.newBuilder()
                .setName("Bob")
                .setGrade(21)
                .build();

        student.add(data);


        System.out.println("Order of students before sorting is: ");

        for (Student aStudent : student) {
            System.out.println(aStudent.getName() + "\t"
                    + aStudent.getGrade());
        }

//        Arrays.sort(student, new GradeComparator());
        Collections.sort(student, new GradeComparator());

        System.out
                .println("Order of students after sorting by student grade is");


        for (Student aStudent : student) {
            System.out.println(aStudent.getName() + "\t"
                    + aStudent.getGrade());
        }

//        Arrays.sort(student, new NameComparator());
        Collections.sort(student, new NameComparator());
        System.out
                .println("Order of students after sorting by student name is");

        for (Student aStudent : student) {
            System.out.println(aStudent.getName() + "\t"
                    + aStudent.getGrade());
        }
    }
}