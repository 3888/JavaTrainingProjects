package bookJava8TheCompleteReferenceSchildt2015._258_основы_применения_методов_по_умолчанию;

public interface MyIF {
    // это объявление обычного метода в интерфейсе.
// Он не предоставляет реализацию по умолчанию
    int getNumber();

    // A это объявление метода по умолчанию.
    // обратите внимание на его реализацию по умолчанию

    default String getString() {
        return "объект типа String по умолчанию";
    }
}
