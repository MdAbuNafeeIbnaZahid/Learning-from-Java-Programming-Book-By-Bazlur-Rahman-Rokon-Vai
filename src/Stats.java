import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nafee on 3/15/18.
 */
public class Stats<T extends Number> {

    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    double getAverage()
    {
        double sum = 0;
        for (T t : nums)
        {
            sum = t.doubleValue();
        }

        return sum / nums.length;
    }
}
