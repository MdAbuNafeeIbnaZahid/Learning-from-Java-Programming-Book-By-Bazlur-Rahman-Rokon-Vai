import java.util.DoubleSummaryStatistics;

/**
 * Created by nafee on 3/12/18.
 */
public class IntegerDoubleCastingTest {
    public static void main(String[] args) {

        Integer i = 10;

        Object o = i;


        System.out.println("Hello");

        Double d = (Double)o;

        System.out.println("2nd Hello");

        System.out.println(d);

    }
}
