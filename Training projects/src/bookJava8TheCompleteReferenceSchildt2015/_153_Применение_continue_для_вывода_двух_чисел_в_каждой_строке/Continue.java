package bookJava8TheCompleteReferenceSchildt2015._153_Применение_continue_для_вывода_двух_чисел_в_каждой_строке;

// ѕродемонстрировать применение оператора continue
class Continue {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}

