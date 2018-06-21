package ClassObj;

/**
 * Created by Anukul-PC on 02-06-2018.
 */
public class ArrStr {
    public static void main(String[] args) {


        Person mimoh = new Person(2, 2, 1, "Ahmedabad", "Male");

        Person kodee = new Person(2, 4, 5, "Chennai", "Female");


        Person anukul = new Person();
        anukul.setPersonLeg(2);
        anukul.setPersonHand(2);
        anukul.setPersonFace(1);
        anukul.setPersonLocation("Bapunagar");
        anukul.setPersonGender("Male");


        Person[] people = new Person[2];


        people[0] = mimoh;
        people[1] = kodee;
        System.out.println(mimoh);

        for (Person aPeople : people) {
            System.out.println(aPeople.getPersonGender() + " | " + aPeople.getPersonLocation());
        }

    }
}
