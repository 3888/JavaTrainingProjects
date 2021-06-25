package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._147_Poisk_v_massive_s_primeneniem_cikla_for_v_stile_foreach;

public class Search {

//    Поиск в массиве с применением цикла for в стиле for each
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
            System.out.println("Zna4enie naideno!");
        }
    }
}







