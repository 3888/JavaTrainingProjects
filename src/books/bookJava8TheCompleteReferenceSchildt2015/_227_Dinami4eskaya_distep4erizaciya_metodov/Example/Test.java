package books.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov.Example;

// —делайте так, чтобы TestCaller мог работать с классами Test10 и Test20
// без использования динамических методов:

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov.Example.Test10;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov.Example.Test20;
import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov.Example.TestCaller;

public class Test {
    public void callMe() {
        System.out.println("AndroidStudyChat");
    }

    public static void main(String[] args) {

        Test test = new Test();
        Test10 t10 = new Test10();
        Test20 t20 = new Test20();

        TestCaller.callTest(test);
        TestCaller.callTest(t10);
        TestCaller.callTest(t20);
    }

}