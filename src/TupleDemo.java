/**
 * Created by nafee on 3/12/18.
 */
public class TupleDemo {
    public static void main(String[] args) {

        Tuple<String, String> stringStringTuple = new Tuple<>("Hello", "World");
        stringStringTuple.showTypeAndValue();

        Tuple<String, Integer> person = new Tuple<>("Rahim", 45);
        person.showTypeAndValue();


        Tuple<String, Tuple> tupleInsideTuple = new Tuple<>("Tuple",
                new Tuple<>(1, 2));

        String s = tupleInsideTuple.getTypeOne();

        Tuple t = tupleInsideTuple.getTypeTwo();


    }
}
