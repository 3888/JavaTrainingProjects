package bookJava8TheCompleteReferenceSchildt2015._147_Поиск_в_массиве_с_применением_цикла_for_в_стиле_foreach;

public class Search {

//    Поиск в массиве с приме не нием цикла for в стиле for each
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 4, 1, 2};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Значение найдено!");
        }
    }
}







