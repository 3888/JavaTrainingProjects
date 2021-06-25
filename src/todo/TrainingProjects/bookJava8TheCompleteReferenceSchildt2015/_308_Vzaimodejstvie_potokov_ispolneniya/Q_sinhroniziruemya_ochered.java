package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._308_Vzaimodejstvie_potokov_ispolneniya;

// Правильная реализация поставщика и потребителя
class Q_sinhroniziruemya_ochered {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        System.out.println(" get()");
        System.out.println("valueSet = " + valueSet);
        while (!valueSet) try {
            System.out.println("while(!valueSet) + wait() ");
            wait();
        } catch (InterruptedException e) {
            System.out.println(
                    "Исключение типа example_04_InterruptedException перехвачено");
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        System.out.println("valueSet = " + valueSet);
        System.out.println(" notify() " );
        notify();
        return n;
    }

    synchronized void put(int n) {
        System.out.println(" put()");
        System.out.println("valueSet = " + valueSet);
        while (valueSet) try {
            System.out.println("while (valueSet) + wait()");
            wait();
        } catch (InterruptedException e) {
            System.out.println(
                    "Исключение типа example_04_InterruptedException перехвачено");
        }
        this.n = n;
        valueSet = true;
        System.out.println("valueSet = " + valueSet);
        System.out.println("Отправлено: " + n);
        System.out.println(" notify() " );
        notify();
    }
}
