package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._308_Vzaimodejstvie_potokov_ispolneniya;

class PC {
    public static void main(String args[]) {
//        A q = new A();
        Q_sinhroniziruemya_ochered q = new Q_sinhroniziruemya_ochered();

        new Producer(q);
        new Consumer(q);
//        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}