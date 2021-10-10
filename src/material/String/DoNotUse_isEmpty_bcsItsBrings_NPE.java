package material.String;

public class DoNotUse_isEmpty_bcsItsBrings_NPE {

    public static void main(String[] args) {

        String nullValue = null;
        System.out.println(nullValue.isEmpty()); // NPE
    }
}
