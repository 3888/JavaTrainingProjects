package material.memory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarbageCollector {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("maxMemory " + runtime.maxMemory());
        System.out.println("totalMemory " + runtime.totalMemory());
        System.out.println("freeMemory " + runtime.freeMemory());

        int listSize = 1_000_000_00;
        List<Date> list = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            Date date = new Date();
            date = null;
        }

        System.out.println("totalMemory after cycle " + runtime.totalMemory());
        System.out.println("freeMemory  after cycle " + runtime.freeMemory());

        System.gc();

        System.out.println("totalMemory after GC " + runtime.totalMemory());
        System.out.println("freeMemory  after GC " + runtime.freeMemory());
    }


}
