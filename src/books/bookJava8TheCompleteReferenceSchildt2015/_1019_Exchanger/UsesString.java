package books.bookJava8TheCompleteReferenceSchildt2015._1019_Exchanger;

import java.util.concurrent.Exchanger;

public class UsesString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UsesString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                // обменять пустой буфер на заполненный
                str = ex.exchange(new String());
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
