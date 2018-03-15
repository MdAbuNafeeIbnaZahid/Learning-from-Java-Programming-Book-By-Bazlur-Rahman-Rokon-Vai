import java.util.ArrayList;
import java.util.List;

/**
 * Created by nafee on 3/15/18.
 */
public class WildCardArgumentDemo {

    public static void print(List<?> list)
    {
        for (Object object : list)
        {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("One");
        stringList.add("Two");

        print(stringList);
    }
}
