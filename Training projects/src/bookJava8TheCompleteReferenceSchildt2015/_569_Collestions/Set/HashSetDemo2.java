package bookJava8TheCompleteReferenceSchildt2015._569_Collestions.Set;

import java.util.HashSet;

public class HashSetDemo2 {

//    Преимущество хеширования заключается в том, что оно обеспечивает
//    постоянство времени выполнения методов add(), contains(), remove()
//    и size() - даже для крупных множеств.

    public static void main(String[] args) {
            HashSet<String> hs = new HashSet<String>();
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}