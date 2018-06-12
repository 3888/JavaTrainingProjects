package android.study.ChatFeatures;

public class Example_boolean {

    public static void main(String[] args) {

        System.out.println(checkTwo(1, 2));
        System.out.println(check(1, 2));
    }

    static boolean checkTwo(int sum, int limit) {
// return true;
//  return(true);
        return (sum > limit);
    }

    static boolean check(int sum, int limit) {
//      if (sum >= limit)
//          return true;
//      else return false;
        return sum >= limit;
    }

}





