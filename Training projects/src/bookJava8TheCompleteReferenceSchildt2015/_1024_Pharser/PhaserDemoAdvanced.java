package bookJava8TheCompleteReferenceSchildt2015._1024_Pharser;

import java.util.concurrent.Phaser;

// Расширить класс Phaser и переопределить метод onAdvance() таким образом,
// чтобы было выполнено только определенное количество фаз
public class PhaserDemoAdvanced {
    public static void main(String args[]) {
        PhaserAdvanced phaser = new PhaserAdvanced(1, 2);

        System.out.println("запуск потоков");

        int cycleCount = 3;
        for (int i = 0; i < cycleCount; i++) {
            int aSCIIcode = 65;
            new PhaserThreadAdvanced(phaser, (aSCIIcode + i));
        }

        for (int i = 0; i < cycleCount; i++) {
            getPhase(phaser);
        }

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }
    }

    private static void getPhase(Phaser phaser) {
        phaser.arriveAndAwaitAdvance(); // известить о достижении фазы
//        System.out.println("Фaзa " + phaser.getPhase() + " завершена");
    }
}

class PhaserThreadAdvanced implements Runnable {
    private Phaser phsr;
    private String name;

    PhaserThreadAdvanced(Phaser р, int aSCIIcode) {
        phsr = р;
        name = Character.toString((char) aSCIIcode);
        phsr.register();
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            startPhase();
        }
    }

    private void startPhase() {
        while (!phsr.isTerminated()) {
            System.out.println("Пoтoк " + name + " начинает " + (phsr.getPhase()) + " фазу");
            phsr.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PhaserAdvanced extends Phaser {
    private int numPhases;

    PhaserAdvanced(int parties, int phaseCount) {
        super(parties);
        this.numPhases = phaseCount - 1;   // если phaseCount = 0, имеем вечный цикл
//        this.numPhases = phaseCount;
    }
// переопределить метод onAdvance() , чтобы выполнить определенное количество фаз

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
// Следующий оператор println() требуется только для целей иллюстрации. Как правило, метод onAdvance()
// не отображает выводимые данные

        System.out.println("onAdvance: Phase " + phase + " is completed");
        System.out.println("phase == numPhases " + String.valueOf(phase == numPhases));
        System.out.println("registeredParties == 0 " + String.valueOf(registeredParties == 0));
// возвратить логическое значение true, если все фазы завершены
//            if (phase == numPhases || registeredParties == 0) return true;
//            return false;
// В противном случае возвратить логическое значение false
        return phase == numPhases || registeredParties == 0;
    }
}