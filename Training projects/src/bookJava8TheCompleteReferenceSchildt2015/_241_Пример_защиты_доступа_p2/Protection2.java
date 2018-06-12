package bookJava8TheCompleteReferenceSchildt2015._241_Пример_защиты_доступа_p2;

import bookJava8TheCompleteReferenceSchildt2015._241_Пример_защиты_доступа_p1.Protection;


public class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета " + getClass().getSimpleName());
        // доступно  только для данного  класса  или пакета
        //  System.out.println("n =  "   +  n);

// доступно  только для  данного  класса
//   System.out.println("n_pri  =  "   + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}