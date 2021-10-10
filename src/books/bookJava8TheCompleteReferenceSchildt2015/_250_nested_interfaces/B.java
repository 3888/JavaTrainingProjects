package books.bookJava8TheCompleteReferenceSchildt2015._250_nested_interfaces;


/**
 * Created by 3888 on 27.05.2016.
 */
public class B implements A.NestedIF {

    public boolean isNotNegative(int x) {
            return  x < 0 ? false : true;
    }
}
