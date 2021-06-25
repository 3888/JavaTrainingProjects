package material.memory;

// http://prologistic.com.ua/chto-takoe-heap-i-stack-pamyat-v-java.html
public class HeapAndStack {

    public static void main(String[] args) { // строка 1
        int i = 1; // строка 2
        Object object = new Object(); // строка 3
        HeapAndStack memory = new HeapAndStack(); // строка 4
        memory.exMethod(object); // строка 5
    } // строка 9

    private void exMethod(Object param) { // строка 6
        String string = param.toString(); // строка 7
        System.out.println(string);
    } // строка 8
}