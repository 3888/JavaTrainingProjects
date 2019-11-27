package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._615_Comparators;

import java.util.Comparator;

public class LastNameComparator implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        //����� ������ ������� � �������� ���������� �������
        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if (k==0) //������ ���������, ��������� ��� � ������� ���������
            return aStr.compareTo(bStr);
        else
            return k;
    }
    //�������������� ����� equals() �� ���������
}