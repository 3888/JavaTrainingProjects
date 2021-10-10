package books.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Day;

public class EnumMethodsDemo {


    public static void main(String[] args) {
       todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum.Day day;

       day = Day.MONDAY;
       String monday = "MONDAY";

        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.toString());
        System.out.println(day.name().equals(monday));
    }
}
