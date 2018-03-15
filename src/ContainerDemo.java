/**
 * Created by nafee on 3/15/18.
 */
public class ContainerDemo {


    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>();

        integerContainer.addItem(1);
        integerContainer.addItem(2);

        integerContainer.printAll();

        Container<String> stringContainer = new Container<>();

    }
}
