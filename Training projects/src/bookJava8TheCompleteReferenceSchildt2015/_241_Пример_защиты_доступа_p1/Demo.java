package bookJava8TheCompleteReferenceSchildt2015._241_Пример_защиты_доступа_p1;


//  получить  экземпляры различных   классов из  пакета p1
public class Demo {
    public static void main(String args[]) {
        Protection obi = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
