package bookJava8TheCompleteReferenceSchildt2015._615_Comparators;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

