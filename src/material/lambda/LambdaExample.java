package material.lambda;


public class LambdaExample {

    public static void main(String[] args) {
        DebugKt.debug(() -> {
            System.out.println("Lambda from Kotlin");
            return null;
        });
    }
}
