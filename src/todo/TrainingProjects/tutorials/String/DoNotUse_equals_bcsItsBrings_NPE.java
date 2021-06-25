package todo.TrainingProjects.tutorials.String;

public class DoNotUse_equals_bcsItsBrings_NPE {

    public static void main(String[] args) {

        String nullValue = null;
        String test = "";
        System.out.println(nullValue.equals(test)); // NPE
    }
}
