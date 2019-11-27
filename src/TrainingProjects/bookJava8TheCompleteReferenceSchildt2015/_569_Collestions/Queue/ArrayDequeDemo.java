package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("EAST");
        adq.push("F");

        System.out.println("Извлечение из стека: ");

        while (adq.peek() !=null)
            System.out.print(adq.pop()+ " ");
        System.out.println("");
    }
}
