package ClassObj;

/**
 * Created by Anukul-PC on 02-06-2018.
 */
public class PersonModel {

    private int personLeg;
    private int personHand;
    private int personFace;
    private String personLocation;
    private String personGender;

    public PersonModel() {
    }

    public PersonModel(int personLeg, int personHand, int personFace, String personLocation, String personGender) {
        this.personLeg = personLeg;
        this.personHand = personHand;
        this.personFace = personFace;
        this.personLocation = personLocation;
        this.personGender = personGender;
    }

//    PersonModel() {
//
//    }

    public int getPersonLeg() {
        return personLeg;
    }

    public void setPersonLeg(int personLeg) {
        this.personLeg = personLeg;
    }

    public int getPersonHand() {
        return personHand;
    }

    public void setPersonHand(int personHand) {
        this.personHand = personHand;
    }

    public int getPersonFace() {
        return personFace;
    }

    public void setPersonFace(int personFace) {
        this.personFace = personFace;
    }

    public String getPersonLocation() {
        return personLocation;
    }

    public void setPersonLocation(String personLocation) {
        this.personLocation = personLocation;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }
}
