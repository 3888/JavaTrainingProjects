package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._250_nested_interfaces;

/**
 * Created by 3888 on 27.05.2016.
 */
public class NestedIFDemo {

    public static void main(String args[]) {
//  использовать  ссылку на  вложенный  интерфейс
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("число 10  неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}

