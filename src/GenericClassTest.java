/**
 * Created by nafee on 3/12/18.
 */
public class GenericClassTest {
    public static void main(String[] args) {

        Generic<Integer> integerGeneric;


        integerGeneric = new Generic<Integer>(88);


        integerGeneric.showType();

        Generic<String> stringGeneric = new Generic<String>("This is a generic Test");
        stringGeneric.showType();
        String str = stringGeneric.getObj();
        System.out.println("str = " + str);

        Generic generic = stringGeneric;
        generic.showType();

        integerGeneric = (Generic<Integer>) generic;
        int i = integerGeneric.getObj();
    }
}
