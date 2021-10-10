package books.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov.DynStack;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov.FixedStack;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov.IntStack;

/* Создать переменную интерфейса и
обратиться к стекам через нее. */
class IFTest3 {
    public static void main(String args[]) {
        IntStack mystack;   //  создать  переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds;           //  загрузить  динамический стек
// разместить числа в стеке
        for (int i = 0; i < 12; i++) mystack.push(i);
        mystack = fs;           // загрузить  фиксированный  стек
        for (int i = 0; i < 8; i++) mystack.push(i);
        mystack = ds;
        System.out.println("Значения  в динамическом стеке:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());
        mystack = fs;
        System.out.println("Значения в фиксированном стеке:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}