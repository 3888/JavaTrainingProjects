package bookJava8TheCompleteReferenceSchildt2015._231_Применение_абстрактных_классов;

/**
 * Created by 3888 on 24.05.2016.
 */
abstract class A {

    abstract void callMe ();
//    абстрактные классы все же могут с одержать конкретные методы

    void callMeToo (){
        System.out.println("Этo конкретный метод.");
    }
}
