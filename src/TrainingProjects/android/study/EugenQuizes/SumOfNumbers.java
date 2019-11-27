package TrainingProjects.android.study.EugenQuizes;

public class SumOfNumbers {

//    ���� �������� ��� ����������� ����� ������ 10,
//      ������� 3 ��� 5, �� ������� 3, 5, 6 � 9.
//      ����� ���� ����� - 23.
//
//    ������� ����� ���� ����� ������ 1000, ������� 3 ��� 5.

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
