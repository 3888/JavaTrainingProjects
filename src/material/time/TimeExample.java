package material.time;

public class TimeExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("startTime = " + startTime);

        long oneSecondInMillis = 1000;

        long endTime = startTime + oneSecondInMillis * 3;

        while (System.currentTimeMillis() < endTime) {
            System.out.println("Pause");
        }

        System.out.println("Job done");

    }
}
