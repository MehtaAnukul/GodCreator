package ClassObj;

/**
 * Created by Anukul-PC on 29-06-2018.
 */
public class Anukul extends DineshKumar {

    public int anukulIncome = 10;

    Anukul() {
        System.out.println("Anukul Constructor");
    }

    @Override
    public void dineshKumarMethod() {
        super.dineshKumarMethod();
        System.out.println("Anukul Here");
    }

    public void anukulMethod() {
        System.out.println("Anukul method");
    }
}
