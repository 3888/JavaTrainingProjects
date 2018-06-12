package tutorials.string;

public class isEmptyNPE {

    public static void main(String[] args) {

        String nullValue = null;
        System.out.println(nullValue.isEmpty()); // NPE
    }
}
