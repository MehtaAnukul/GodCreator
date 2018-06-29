package ClassObj;

import javax.naming.ldap.Control;

/**
 * Created by Anukul-PC on 26-06-2018.
 */
public class ConstructorDemo {


    public ConstructorDemo() {
        System.out.println("hello");
    }

    void test() {
        System.out.println("method execution start here");
    }

    void second() {
        System.out.println("Second method");
    }

    public static void main(String[] args) {

        new ConstructorDemo().test();

        System.out.println("New refernce for class");
        ConstructorDemo constructorDemo = new ConstructorDemo();
        constructorDemo.test();

        System.out.println("Delayed");
        System.out.println("Delayed");
        System.out.println("Delayed");

        constructorDemo.second();

    }
}
