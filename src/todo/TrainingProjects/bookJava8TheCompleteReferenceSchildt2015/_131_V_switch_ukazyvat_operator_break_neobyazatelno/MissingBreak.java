package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._131_V_switch_ukazyvat_operator_break_neobyazatelno;

//   В  операторе  switch  необязательно указывать  операторы break
class MissingBreak {
    public static void main(String args[]) {
        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i menwe 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i menwe  10");
                    break;
                default:
                    System.out.println("i ravno ili bolwe 10");
            }
    }
}
//    Эта программа выводит следующий результат:
//
//        i меньше 5
//        i меньше 5
//        i меньше 5
//        i меньше 5
//        i меньше 5
//        i меньше  10
//        i меньше  10
//        i меньше  10
//        i меньше  10
//        i меньше  10
//        i  равно  или   больше   10
//        i  равно  или   больше   10
