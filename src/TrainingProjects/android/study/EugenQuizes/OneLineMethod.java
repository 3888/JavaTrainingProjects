package TrainingProjects.android.study.EugenQuizes;

public class OneLineMethod {
    public static void main(String[] args) {

//        Could this function has body in one line?"
        isOdd(2);
        isOddOneLine(2);
    }

    private static boolean isOdd(int value) {
        boolean result = false;
        if (value % 2 > 0) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

    private static boolean isOddOneLine(int value) {
        System.out.println(value % 2 > 0);
        return value % 2 > 0;
    }
}



