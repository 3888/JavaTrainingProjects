package oracle.Concurrency;


public class example_04_InterruptedException {
    private static int i = 0;

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                while (!Thread.currentThread().isInterrupted()) {
                    //do stuff
                    System.out.println(".getState() " + Thread.currentThread().getState());
                    try {
                        i++;
                        System.out.println("Thread task " + i);
                        Thread.sleep(500);

                        if (i == 3) {
                            System.out.println("interrupt()");
                            Thread.currentThread().interrupt();//propagate interrupt
                            System.out.println(".getState() " + Thread.currentThread().getState());
                        }

                        if (Thread.interrupted()) {
                                throw new java.lang.InterruptedException();
                        }


                    } catch (java.lang.InterruptedException e) {
                        System.out.println("InterruptedException " + e);
                        Thread.currentThread().interrupt();
                        System.out.println(".getState() " + Thread.currentThread().getState());
                    }
                }
            }
        });
        t.start();
    }
}