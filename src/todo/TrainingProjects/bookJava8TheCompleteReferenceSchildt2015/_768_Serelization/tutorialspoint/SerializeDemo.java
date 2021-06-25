package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._768_Serelization.tutorialspoint;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    private static String FILE_PATH;

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
//            new FileOutputStream("employee");
                    new FileOutputStream(createNewFile("/tmp/employee.ser"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
//            System.out.printf("Serialized data is saved in employee");
            System.out.printf("Serialized data is saved in " + FILE_PATH);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static File createNewFile(final String fileUrl) throws IOException {
        File file = new File(fileUrl);

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }

        FILE_PATH = file.getAbsolutePath();

        return file;
    }
}