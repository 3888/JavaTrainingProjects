package hashCodeAndEquals;

public class HashCode {
    public static void main(String[] args) {
        Instance objectOne = new Instance();
        Instance objectTwo = new Instance();

        boolean hashCode = objectOne.hashCode() == objectTwo.hashCode();

        objectOne.setA(1);
        objectOne.setB(2);

        objectTwo.setA(1);
        objectTwo.setB(2);

/*
* Объекты одинаковые, ожидаем true
* */
        System.out.println("objectOne.hashCode() == objectTwo.hashCode() " +
                hashCode);

        objectTwo.setA(2);
        objectTwo.setB(1);

/*
* Зесь мы имеем 2 объекта которые имеют разные значение,
* то есть и объекты являются разными. Ожидаем false
* Получаем коллизию, хэш код одинаковый
* */
        System.out.println("Collision objectOne.hashCode() == objectTwo.hashCode() " +
                hashCode);

        objectTwo.setA(25);
        objectTwo.setB(100);

/*
* Объект имеет всегда один хэш-код. Равен сам себе
* */
        System.out.print("objectOne.hashCode() == objectOne.hashCode() ");
        System.out.println(objectOne.hashCode() == objectOne.hashCode());

/*
* Пример того, что разные хэш-кода, указывают на разные
* объекты.
* */
        System.out.println("objectOne = " + objectOne.hashCode()
                + " objectTwo = " + objectTwo.hashCode());
    }
}