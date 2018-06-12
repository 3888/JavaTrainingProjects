package bookJava8TheCompleteReferenceSchildt2015._258_основы_применения_методов_по_умолчанию;

public class DefaultMethodDemo {

    public static void main(String[] args) {
        MyIFimp obj = new MyIFimp();
//        Метод getNumber() можно вызвать, т.к. он явно реализован в классе MyIFimp

        System.out.println(obj.getNumber());


// Метод getString() также можно вызвать, т.к в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj.getString());
    }
}
