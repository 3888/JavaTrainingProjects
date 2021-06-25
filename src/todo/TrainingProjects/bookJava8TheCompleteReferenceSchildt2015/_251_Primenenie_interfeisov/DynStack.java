package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov;

// Реализация "наращиваемого" стека

class DynStack implements IntStack {
    private int stack[];
    private int tos;

    // выделить память и инициализировать стек
    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
// если стек заполнен, выделить память под стек большего размера
        if (tos == stack.length - 1) {
            int temp[] = new int[stack.length * 2]; // удвоить размер стека
            for (int i = 0; i < stack.length; i++) temp[i] = stack[i];
            stack = temp;
            stack[++tos] = item;
        } else
            stack[++tos] = item;
    }

// извлечь элемент из стека

    public int pop() {
        if (tos < 0) {
            System.out.println("CTeK не загружен.");
            return 0;
        } else
            return stack[tos--];
    }
}
