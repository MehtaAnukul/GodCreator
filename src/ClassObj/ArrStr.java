package ClassObj;

/**
 * Created by Anukul-PC on 02-06-2018.
 */
public class ArrStr {
    public static void main(String[] args) {


        PersonModel mimoh = new PersonModel(2, 2, 1, "Ahmedabad", "Male");

        PersonModel kodee = new PersonModel(2, 4, 5, "Chennai", "Female");


        PersonModel anukul = new PersonModel();
        anukul.setPersonLeg(2);
        anukul.setPersonHand(2);
        anukul.setPersonFace(1);
        anukul.setPersonLocation("Bapunagar");
        anukul.setPersonGender("Male");


        PersonModel[] people = new PersonModel[2];


        people[0] = mimoh;
        people[1] = kodee;
        System.out.println(mimoh);

        for (PersonModel aPeople : people) {
            System.out.println(aPeople.getPersonGender() + " | " + aPeople.getPersonLocation());
        }

    }
}
