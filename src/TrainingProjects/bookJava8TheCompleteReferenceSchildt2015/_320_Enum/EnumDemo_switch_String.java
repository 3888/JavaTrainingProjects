package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

public class EnumDemo_switch_String {


    public enum MethodType {
        DOUBLE, LIST, STRING, ARRAYLIST, FLOAT, LONG;
    }

    public static void main(String[] args) {
        String value = "DOUBLE";
        switch (MethodType.valueOf(value)) {
            case DOUBLE:
                System.out.println("It's a double");
                break;
            case LIST:
                System.out.println("It's a list");
                break;
        }
    }
}
