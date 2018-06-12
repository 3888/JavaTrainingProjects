package bookJava8TheCompleteReferenceSchildt2015._310_Пример_взаимной_блокировки;

class B {
        synchronized void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " вошел в метод B.bar{)");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Класс B прерван");
            }
            System.out.println(name + "  пытается вызвать метод A.lastO");
            a.last();
        }

        synchronized void last() {
            System.out.println("B методе A.last()");
        }

    }
