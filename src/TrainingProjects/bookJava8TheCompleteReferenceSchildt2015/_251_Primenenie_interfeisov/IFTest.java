package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._251_Primenenie_interfeisov;

class IFTest {
    public static void main(String args[]) {
        FixedStack mystackl = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
// разместить числа в стеке
        for (int i = 0; i < 5; i++) mystackl.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
// извлечь эти числа из стека
        System.out.println("Cтек в mystackl:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystackl.pop());
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
