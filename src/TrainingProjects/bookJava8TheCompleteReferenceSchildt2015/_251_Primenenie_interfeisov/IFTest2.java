package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov;

class IFTest2 {
    public static void main(String args[]) {
        DynStack mystackl = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
// В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) mystackl.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);
        System.out.println("Стек в mystackl:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystackl.pop());
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}