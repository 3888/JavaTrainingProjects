package logicUpgrade.Java_Quizes;

public class Quiz_003 {
    public static void main(String[] args) {

        int x = 5;
        int y[] = {5};

        doSomething1(x);
        doSomething2(y);

        System.out.println(x + "" + y[0]);
//        5 8

//  [15:26:26] Eugene EugenQuizes - eresid@gmail.com: в джаві значення передаються по посиланню чи по значенню?
//        [15:27:40] Anton Svistielnikov: отвечаю без дяди гугла
//        объекты по ссылкам, примитивы по значениям
//        т.е. мы положили в по 0 индексу 8 и получил 8
//        а х = 5 и doSomething1 тут ни при чем получается
    }

    static void doSomething1(int x) {
        x = 8;
    }

    static void doSomething2(int y[]) {
        y[0] = 8;
    }
}

