package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._258_osnovy_primeneniya_metodov_po_umolchaniyu;

public class MyIFimp implements MyIF {
//    В этом классе должен быть реализован только метод getNumber(), определенный в интерфейсе МyIF
//    А вызов метода qetString() разрешается по умолчанию

    @Override
    public int getNumber() {
        return 100;
    }
}
