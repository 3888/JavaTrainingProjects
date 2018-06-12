package bookJava8TheCompleteReferenceSchildt2015._610_HashMap;

import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, String> hashMap = new java.util.HashMap<>();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Cлов у словнику: " + hashMap.size());
            System.out.println("Введіть команду:");
            System.out.println("add, show, remove, showall");
            String key = scan.nextLine();
            if (key.equals("add")) {

                System.out.println("Введіть слово:");
                key = scan.nextLine();
                System.out.println("Введіть переклад:");
                String value = scan.nextLine();

                hashMap.put(key, value);
            } else if (key.equals("show")) {
                System.out.println("Введіть слово для перекладу:");
                key = scan.nextLine();
                if (hashMap.containsKey(key)) {
                    System.out.println("Запит:" + key);
                    System.out.println("Переклад:" + hashMap.get(key));
                }
            } else if (key.equals("remove")) {
                System.out.println("Введіть слово для видалення:");
                key = scan.nextLine();
                hashMap.remove(key);
            } else if (key.equals("showall")) {
                System.out.println("Всi записи словника: " + hashMap.entrySet());
            } else {
                System.out.println("Невідома команда");
            }

        } while (!exit);
    }
}