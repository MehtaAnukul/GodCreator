package ClassObj;

/**
 * Created by Anukul-PC on 29-06-2018.
 */
public class DineshKumar extends BabuDada {

    public int dineshKumarIncome = 10000;

    DineshKumar() {
        System.out.println("DineshKumar Constructor");
    }


    @Override
    public void babuDadaMethod() {
        super.babuDadaMethod();
        System.out.println("DineshKumar here");
    }

    public void dineshKumarMethod() {
        System.out.println("Dineshkumar method");

    }

}
