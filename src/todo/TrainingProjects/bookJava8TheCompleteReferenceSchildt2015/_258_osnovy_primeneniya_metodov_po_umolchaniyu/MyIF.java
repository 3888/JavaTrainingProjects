package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._258_osnovy_primeneniya_metodov_po_umolchaniyu;

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
