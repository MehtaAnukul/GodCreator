package ClassObj;

/**
 * Created by Anukul-PC on 29-06-2018.
 */
public class StaticDemo {

    public static int staticCount = 10;
    public int normalCount = 10;

    void increment() {
        staticCount = staticCount + 10;
        normalCount = normalCount + 10;

        System.out.println("STATIC===>" + staticCount);
        System.out.println("NORMAL====>" + normalCount);
    }

}
