package books.bookJava8TheCompleteReferenceSchildt2015._610_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        //ввести элементы в хеш-отображение
        hm.put("1Джон Доу", new Double(3434.34));
        hm.put("2Том Смит", new Double(123.22));
        hm.put("3Джейн Бейкер", new Double(1378.00));
        hm.put("4Тод Холл", new Double(99.22));
        hm.put("5Ральф Смит", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        System.out.print("\n");

        //Java 8 вывести множество записей
        hm.entrySet().forEach(System.out::println);
        System.out.print("\n");

        //внести сумму 1000 на счет Джона Доу
        double balance = hm.get("1Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + hm.get("Джон Доу"));
        System.out.print("\n");
        System.out.println("containsKey Джон Доу " + hm.containsKey("Джон Доу"));
        System.out.print("\n");
        System.out.println("keySet " + hm.keySet());
        System.out.println("values " + hm.values());

    }
}