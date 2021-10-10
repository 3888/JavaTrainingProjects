package books.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers;

import java.util.Random;

class Question {

    Random rand = new Random();

    todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15)
            return todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers.MAYBE; // 15%
        else if (prob < 30)
            return todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers.NO; // 15%
        else if (prob < 60)
            return todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers.YES; // 30%
        else if (prob < 75)
            return todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers.LATER; // 15%
        else if (prob < 98)
            return todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example.Answers.SOON; // 13%
        else
            return Answers.NEVER; // 2%
    }
}


