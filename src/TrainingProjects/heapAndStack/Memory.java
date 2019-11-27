package TrainingProjects.heapAndStack;

// http://prologistic.com.ua/chto-takoe-heap-i-stack-pamyat-v-java.html
public class Memory {

    public static void main(String[] args) { // ������ 1
        int i = 1; // ������ 2
        Object object = new Object(); // ������ 3
        Memory memory = new Memory(); // ������ 4
        memory.exMethod(object); // ������ 5
    } // ������ 9

    private void exMethod(Object param) { // ������ 6
        String string = param.toString(); // ������ 7
        System.out.println(string);
    } // ������ 8
}