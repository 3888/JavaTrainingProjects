package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._224_Pereopredelenie_metodov1;

/**
 * Created by 3888 on 20.05.2016.
 */
class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);

        subOb.show();   //  здесь   вызывается метод  show()   из  класса В

        subOb.show("Это  k:  ");  //  вызвать  метод  show ()  из  класса  В
    }
}
