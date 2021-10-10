package books.bookJava8TheCompleteReferenceSchildt2015._612_TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        //ввести элементы в древовидное отображение
        tm.put("1Джон Доу", new Double(3434.34));
        tm.put("2Том Смит", new Double(123.22));
        tm.put("3Джейн Бейкер", new Double(1378.00));
        tm.put("4Тод Холл", new Double(99.22));
        tm.put("5Ральф Смит", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("1Джон Доу");
        tm.put("Джон Доу", balance+1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}