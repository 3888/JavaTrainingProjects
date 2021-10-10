package books.bookJava8TheCompleteReferenceSchildt2015._615_Comparators;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapLastNameDemo {

    public static void main(String[] args) {

        //создать древовилное отобрадение
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new LastNameComparator());

        //ввести элементы в древовидное отображение
        treeMap.put("Боб Доу", new Double(3434.34));
        treeMap.put("Агент Смит", new Double(123.22));
        treeMap.put("Джон Смит", new Double(133.33));
        treeMap.put("Джейн Алан", new Double(1378.00));
        treeMap.put("Тод Холл", new Double(99.22));
        treeMap.put("Ральф Уилфред", new Double(-19.08));

        //получить множество элементов
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        System.out.println(TreeMapLastNameDemo.class.getSimpleName());

        //вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = treeMap.get("Боб Доу");
        treeMap.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Боба Доу: " + treeMap.get("Джон Доу"));

    }
}