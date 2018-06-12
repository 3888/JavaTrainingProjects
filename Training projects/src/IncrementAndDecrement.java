
public class IncrementAndDecrement {

    public static void main(String[] args) {

//        префиксный
        int i = 9;
        int m = 8 * ++i;

//        постфиксный
        int x = 6;
        int y = 8 * x++;

        System.out.println("i = " + i);
        System.out.println("m = " + m);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
            }
        }