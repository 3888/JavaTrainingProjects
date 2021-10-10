package books.bookJava8TheCompleteReferenceSchildt2015._188_Recrussion;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._188_Recrussion.RecTest;

public class Recursion2 {
    public static void main(String[] args) {
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._188_Recrussion.RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}