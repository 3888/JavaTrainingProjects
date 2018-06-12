import java.util.concurrent.TimeUnit;

public class Blank {

    public static void main(String[] args) throws Exception {

        long dateFrom = 1459630800;
        long dateTo = 1491166800;

        long days = TimeUnit.MILLISECONDS.toDays(dateTo - dateFrom);


        System.out.println(dateTo - dateFrom);
        System.out.println(TimeUnit.SECONDS.toDays(31536000));
        System.out.println(days);


    }
}
