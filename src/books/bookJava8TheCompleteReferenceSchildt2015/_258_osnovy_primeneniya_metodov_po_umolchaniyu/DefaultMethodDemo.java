package books.bookJava8TheCompleteReferenceSchildt2015._258_osnovy_primeneniya_metodov_po_umolchaniyu;

import todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._258_osnovy_primeneniya_metodov_po_umolchaniyu.MyIFimp;

public class DefaultMethodDemo {

    public static void main(String[] args) {
        todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._258_osnovy_primeneniya_metodov_po_umolchaniyu.MyIFimp obj = new MyIFimp();
//        Метод getNumber() можно вызвать, т.к. он явно реализован в классе MyIFimp

        System.out.println(obj.getNumber());


// Метод getString() также можно вызвать, т.к в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj.getString());
    }
}
