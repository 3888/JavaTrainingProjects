package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A 1");
        adq.push("B 2");
        adq.push("D 3");
        adq.push("EAST 4");
        adq.push("F 5");

        System.out.println("Izvle4enie iz steka: ");

        while (adq.peek() !=null)
            System.out.print(adq.pop()+ " ");
        System.out.println("");
    }
}
