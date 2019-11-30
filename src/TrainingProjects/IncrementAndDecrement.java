package TrainingProjects;

public class IncrementAndDecrement {

    public static void main(String[] args) {

//        префиксный
        int i = 9;
        int m = 8 * ++i;

        System.out.println("prefix increment i = " + i);
        System.out.println("prefix increment m = " + m);

//        постфиксный
        int x = 9;
        int y = 8 * x++;

        System.out.println("postfix increment x = " + x);
        System.out.println("postfix increment y = " + y);
            }
        }