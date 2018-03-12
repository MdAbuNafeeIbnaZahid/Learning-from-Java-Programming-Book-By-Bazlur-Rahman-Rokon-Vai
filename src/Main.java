///**
// * Created by nafee on 3/12/18.
// */
//public class Main {
//    public static void main(String[] args) {
//        Quarter q = new Quarter();
//        Nickel n = new Nickel();
//        System.out.println(q);
//        System.out.println(n);
//    }
//}
//
//public abstract class Money {
//    private int value;
//
//    public Money(int v) {
//        value=v;
//    }
//
//    public abstract int getValue();
//
//    protected int myValue() {
//        return value;
//    }
//
//    public abstract String toString();
//}
//
//abstract class Coin extends Money {
//    public Coin(int value) {
//        super(value);
//        System.out.println("I am a coin, my value is " + getValue());
//    }
//}
//
//class Quarter extends Coin {
//    public Quarter() {
//        super(25);
//    }
//}