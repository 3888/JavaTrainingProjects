package material.annotations;

import com.sun.istack.internal.NotNull;

public class Annotation {
    public static void main(String[] args) {

            printValue(null);
            printValue("");

    }

    private static void printValue(@NotNull String value) {
        System.out.println(value);
    }

}


