package bookJava8TheCompleteReferenceSchildt2015._615_Comparators;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapLastNameDemoJ8 {

    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new FirstNameComparator());

        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        //ввести элементы в древовидное отображение
        tm.put("Боб Доу", new Double(3434.34));
        tm.put("Агент Смит", new Double(123.22));
        tm.put("Джон Смит", new Double(133.33));
        tm.put("Джейн Алан", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Уилфред", new Double(-19.08));

        //получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        System.out.println(TreeMapLastNameDemoJ8.class.getSimpleName());

        //вывести элементы из множества
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Боб Доу");
        tm.put("Джон Доу", balance+1000);
        System.out.println("Новый остаток на счете Боба Доу: " + tm.get("Боб Доу"));

    }
}
