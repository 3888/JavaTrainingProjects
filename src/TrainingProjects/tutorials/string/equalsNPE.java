package TrainingProjects.tutorials.string;

public class equalsNPE {

    public static void main(String[] args) {

        String nullValue = null;
        String test = "";
        System.out.println(nullValue.equals(test)); // NPE
    }
}
