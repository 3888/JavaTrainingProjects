package TrainingProjects.tutorials.Multithreading.Race_Condition;

class Counter  implements Runnable{
    private int c = 0;

    private void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        c++;
    }

    private void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        //incrementing
        this.increment();
        System.out.println("Value for Thread After increment "
                + Thread.currentThread().getName() + " " + this.getValue());
        //decrementing
        this.decrement();
        System.out.println("Value for Thread After decrement "
                + Thread.currentThread().getName() + " " + this.getValue());
    }
}