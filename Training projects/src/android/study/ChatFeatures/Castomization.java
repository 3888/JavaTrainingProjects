package android.study.ChatFeatures;

import java.util.ArrayList;


public class Castomization {

//    читни главу шилдта про колекції, там все це розжовано
//    операція виділення пам’яті дуже дорога, правильно 1 раз виділити пам’яті скільки
//    треба чим міліон раз по трохи

    public static void main(String[] args) {
        long test1Start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            integers.add(i);
        }
        System.out.println("start 1 " + (System.currentTimeMillis() - test1Start));

        long test2Start = System.currentTimeMillis();
        ArrayList<Integer> integers2 = new ArrayList<>(10000000);
        for (int i = 0; i < 10000000; i++) {
            integers2.add(i);
        }
        System.out.println("start 2 " + (System.currentTimeMillis() - test2Start));
    }
}
