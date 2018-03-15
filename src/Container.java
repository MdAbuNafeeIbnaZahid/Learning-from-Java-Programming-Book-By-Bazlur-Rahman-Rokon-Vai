/**
 * Created by nafee on 3/15/18.
 */
public class Container<T> {
    public static final int MAX_LENGTH = 10;

    private T[] items;
    private int currentIndex = 0;


    public Container()
    {
        items = (T[]) new Object[MAX_LENGTH];
    }

    public void addItem(T newItem)
    {
        if (currentIndex >= MAX_LENGTH)
        {
            System.out.println(" Container is full ");
            return;
        }

        items[currentIndex++] = newItem;
    }

    public T getItem(int idx)
    {
        if (idx < 0 || idx > MAX_LENGTH)
        {
            throw new IllegalArgumentException(" Index can't be larger than max ");
        }

        return items[idx];
    }

    public void printAll()
    {
        for (T t : items)
        {
            System.out.println( t + ", " );
        }
    }
}
