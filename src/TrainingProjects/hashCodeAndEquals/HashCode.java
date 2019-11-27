package TrainingProjects.hashCodeAndEquals;

public class HashCode {
    public static void main(String[] args) {
        Instance objectOne = new Instance();
        Instance objectTwo = new Instance();

        boolean hashCode = objectOne.hashCode() == objectTwo.hashCode();

        objectOne.setA(1);
        objectOne.setB(2);

        objectTwo.setA(1);
        objectTwo.setB(2);

/*
* ������� ����������, ������� true
* */
        System.out.println("objectOne.hashCode() == objectTwo.hashCode() " +
                hashCode);

        objectTwo.setA(2);
        objectTwo.setB(1);

/*
* ���� �� ����� 2 ������� ������� ����� ������ ��������,
* �� ���� � ������� �������� �������. ������� false
* �������� ��������, ��� ��� ����������
* */
        System.out.println("Collision objectOne.hashCode() == objectTwo.hashCode() " +
                hashCode);

        objectTwo.setA(25);
        objectTwo.setB(100);

/*
* ������ ����� ������ ���� ���-���. ����� ��� ����
* */
        System.out.print("objectOne.hashCode() == objectOne.hashCode() ");
        System.out.println(objectOne.hashCode() == objectOne.hashCode());

/*
* ������ ����, ��� ������ ���-����, ��������� �� ������
* �������.
* */
        System.out.println("objectOne = " + objectOne.hashCode()
                + " objectTwo = " + objectTwo.hashCode());
    }
}