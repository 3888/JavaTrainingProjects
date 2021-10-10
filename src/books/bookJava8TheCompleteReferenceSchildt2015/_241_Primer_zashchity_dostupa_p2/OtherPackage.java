package books.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p2;


import books.bookJava8TheCompleteReferenceSchildt2015._241_Primer_zashchity_dostupa_p1.Protection;

public class OtherPackage {

    OtherPackage() {
        Protection p
                = new Protection();
            System.out.println("конструктор из другого пакета " + getClass().getSimpleName());

// доступно только для данного класса или пакета // System.out.println("n = "   +  p.n);
// доступно только для данного класса
// System.out.println("n_pri = " + p.n_pri);
// доступно только для данного класса, подкласса или пакета // System.out.println("n_pro = " + p.n_pro);

            System.out.println("n_pub = " + p.n_pub);
    }

}


