package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators;

import java.util.Comparator;

public class MyComparatorReversed implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;

        //��������� ��������� � �������� �������
        return bStr.compareTo(aStr);
    }
    //�������������� ����� equals() �� ���������
}
