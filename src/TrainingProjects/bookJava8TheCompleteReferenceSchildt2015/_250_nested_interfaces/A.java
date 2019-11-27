package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._250_nested_interfaces;

// Пример вложенного интерфейса
// Этот класс содержит интерфейс  как свой член
class A {
    //  это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}