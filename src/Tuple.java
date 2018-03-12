/**
 * Created by nafee on 3/12/18.
 */
public class Tuple<TypeOne, TypeTwo>
{
    private TypeOne typeOne;
    private  TypeTwo typeTwo;

    public Tuple(TypeOne typeOne, TypeTwo typeTwo) {
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
    }

    public TypeOne getTypeOne() {
        return typeOne;
    }

    public TypeTwo getTypeTwo() {
        return typeTwo;
    }

    public void setTypeOne(TypeOne typeOne) {
        this.typeOne = typeOne;
    }

    public void setTypeTwo(TypeTwo typeTwo) {
        this.typeTwo = typeTwo;
    }

    private void showTypes()
    {
        System.out.println(" Type of TypeOne is  " + typeOne.getClass().getName() );
        System.out.println(" Type of TypeTwo is  " + typeTwo.getClass().getName() );
    }

    private void showValues()
    {
        System.out.println("Value of typeOne is " + typeOne );
        System.out.println("Value of typeTwo is " + typeTwo );
    }

    public void showTypeAndValue()
    {
        showTypes();
        showValues();
    }



}
