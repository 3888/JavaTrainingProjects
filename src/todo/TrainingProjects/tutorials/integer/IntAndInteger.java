package todo.TrainingProjects.tutorials.integer;

class IntAndInteger {

//  http://habrahabr.ru/post/104231/
//  ... ��������� ����� java.lang.Integer.valueOf(int), �������, ��� �� ������ ������� � ����������,
//  �������� �������� �� -128 �� 127 (� ����� ������ ���������� ������� ������� ���� ����� ������).

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);
    }
}