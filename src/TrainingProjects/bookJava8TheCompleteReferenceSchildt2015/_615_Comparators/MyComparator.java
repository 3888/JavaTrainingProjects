package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;

        //��������� ��������� � �������� �������
        return aStr.compareTo(bStr);
    }
    //�������������� ����� equals() �� ���������
}
