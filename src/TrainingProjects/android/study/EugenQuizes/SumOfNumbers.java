package TrainingProjects.android.study.EugenQuizes;

public class SumOfNumbers {

//    Если выписать все натуральные числа меньше 10,
//      кратные 3 или 5, то получим 3, 5, 6 и 9.
//      Сумма этих чисел - 23.
//
//    Найдите сумму всех чисел меньше 1000, кратных 3 или 5.

    public static void main(String[] args) {

        int value = 1;
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            if (value % 3 == 0 || value % 5 == 0) {
                System.out.println(value);
                sum += value;
            }
            value++;
        }
        System.out.println("Sum = " + sum);
    }
}
