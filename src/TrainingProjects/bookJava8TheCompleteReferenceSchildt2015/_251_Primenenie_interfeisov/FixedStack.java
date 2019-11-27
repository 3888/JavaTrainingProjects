package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov;

/**
 * Created by 3888 on 27.05.2016.
 */
public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    // выделить память и инициализировать стек

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        if (tos == stack.length - 1)
            // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;

        } else return stack[tos--];
    }
}


