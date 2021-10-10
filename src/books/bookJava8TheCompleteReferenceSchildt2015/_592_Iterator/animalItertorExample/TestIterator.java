package books.bookJava8TheCompleteReferenceSchildt2015._592_Iterator.animalItertorExample;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._592_Iterator.animalItertorExample.Animal;

import java.util.ArrayList;

public class TestIterator{

    public static void main(String args[]) {
        ArrayList<String> animalList = new ArrayList();
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Tiger");
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._592_Iterator.animalItertorExample.Animal animal = new Animal(animalList);
        for (String animalObj : animal) {
            System.out.println(animalObj);
        }
    }
}