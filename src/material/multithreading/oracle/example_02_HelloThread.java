package material.multithreading.oracle;

public class example_02_HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new example_02_HelloThread()).start();
    }

}