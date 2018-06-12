package bookJava8TheCompleteReferenceSchildt2015._224_Переопределение_методов;


public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i  и  j:   " + i + "   " + j);
    }
}
