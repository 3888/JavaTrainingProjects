package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._291_Upravlenie_glavnym_potokom_ispolneniya;

// ”правление главным потоком исполнения
class CurrentThreadDemo {
    public static void main(String args[]) {
//        Thread t = new Thread("Apple");
        Thread t = Thread.currentThread();
        System.out.println("“екущий поток исполнения: " + t);

//        обратите внимание на то, что вывод производится тогда, когда переменная t
//        служит в качестве аргумента метода println(). этот метод выводит по порядку
//        имя потока исполнения, его приоритет и имя его группы.

// изменить имя потока исполнения
        t.setName("My Thread");
        System.out.println("ѕосле изменения имени потока: " + t.getName());
//        System.out.println("ѕосле изменения имени потока: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("√лавный поток исполнения прерван");
        }
    }

//    обратите внимание на то, что вывод производится тогда, когда переменная t
//    служит в качестве аргумента метода println () . этот метод выводит по порядку имя
//    потока исполнения, его приоритет и имя его группы. ѕо умолчанию главный поток
//    исполнения имеет имя main и приоритет, равный 5. »менем main обозначается так≠
//    же группа потоков исполнения , к которой относите.я данный поток

}
