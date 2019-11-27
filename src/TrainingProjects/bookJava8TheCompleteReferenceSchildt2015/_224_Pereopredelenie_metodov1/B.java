package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._224_Pereopredelenie_metodov1;

/**
 * Created by 3888 on 20.05.2016.
 */
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной к с помощью метода,
// переопределяющего метод show() из класса A
    void show() {
        super.show();  // эдесь  вызывается метод  show()  из класса  A

        System.out.println("k: " + k);

    }

    // перегрузить  метод  show ()
    void show(String msg) {
        System.out.println(msg + k);
    }
}



