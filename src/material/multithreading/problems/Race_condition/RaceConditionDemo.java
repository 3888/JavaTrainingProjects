package material.multithreading.problems.Race_condition;

public class RaceConditionDemo {
    /*
    https://netjs.blogspot.com/2015/06/race-condition-in-java-multi-threading.html
     */
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter, "Thread-1 ");
        Thread t2 = new Thread(counter, "Thread-2 ");
        Thread t3 = new Thread(counter, "Thread-3 ");
        t1.start();
        t2.start();
        t3.start();
    }
}