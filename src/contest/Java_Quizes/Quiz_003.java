package contest.Java_Quizes;

public class Quiz_003 {
    public static void main(String[] args) {

        int x = 5;
        int y[] = {5};

        doSomething1(x);
        doSomething2(y);

        System.out.println(x + "" + y[0]);
//        5 8

//  [15:26:26] Eugene EugenQuizes - eresid@gmail.com: � ���� �������� ����������� �� ��������� �� �� ��������?
//        [15:27:40] Anton Svistielnikov: ������� ��� ���� �����
//        ������� �� �������, ��������� �� ���������
//        �.�. �� �������� � �� 0 ������� 8 � ������� 8
//        � � = 5 � doSomething1 ��� �� ��� ��� ����������
    }

    static void doSomething1(int x) {
        x = 8;
    }

    static void doSomething2(int y[]) {
        y[0] = 8;
    }
}

