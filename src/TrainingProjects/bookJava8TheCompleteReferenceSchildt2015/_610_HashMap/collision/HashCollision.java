package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._610_HashMap.collision;

import java.util.HashMap;
import java.util.Map;

public class HashCollision {

    public static void main(String[] args) {

        Map<MyInnerClass, String> myMap = new HashMap<MyInnerClass, String>();
        myMap.put(new MyInnerClass("AB", "CD"), "First");

        //Same hashCode same equals
        myMap.put(new MyInnerClass("AB", "CD"), "First");

        //Same hashCode different equals
        myMap.put(new MyInnerClass("ABC", "D"), "Second");

        System.out.println("  " + myMap);
    }
}

class MyInnerClass {
    private String StrA;
    private String StrB;

    public MyInnerClass(String strA, String strB) {
        super();
        StrA = strA;
        StrB = strB;
    }

    @Override
    public int hashCode() {
        return (StrA + StrB).length();
    }

    @Override
    public boolean equals(Object obj) {
        if (StrB.length() == StrA.length()) {
            return true;
        }
        return false;
    }
}