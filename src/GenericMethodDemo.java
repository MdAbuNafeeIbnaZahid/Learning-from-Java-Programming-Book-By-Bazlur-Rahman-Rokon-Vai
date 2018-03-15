import javafx.util.Pair;

/**
 * Created by nafee on 3/15/18.
 */
public class GenericMethodDemo {

    public static boolean isEqual(Pair p1, Pair p2)
    {
        return p1.getKey().equals( p2.getKey() ) && p1.getValue().equals( p2.getValue() );
    }

    public static void main(String[] args) {

        boolean isEq = isEqual(new Pair<>(1, 2), new Pair<>(2, 3));


    }
}
