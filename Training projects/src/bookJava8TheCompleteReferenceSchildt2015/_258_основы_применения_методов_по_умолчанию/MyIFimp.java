package bookJava8TheCompleteReferenceSchildt2015._258_основы_применения_методов_по_умолчанию;

public class MyIFimp implements MyIF {
//    В этом классе должен быть реализован только метод getNumber(), определенный в интерфейсе МyIF
//    А вызов метода qetString() разрешается по умолчанию

    @Override
    public int getNumber() {
        return 100;
    }
}
