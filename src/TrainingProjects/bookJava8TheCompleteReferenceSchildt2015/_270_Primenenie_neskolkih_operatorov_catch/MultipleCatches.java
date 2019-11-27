package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._270_Primenenie_neskolkih_operatorov_catch;

/**
 * Created by 3888 on 31.05.2016.
 */
public class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка  индексации  за   пределами массива: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
