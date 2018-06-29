package ClassObj;

/**
 * Created by Anukul-PC on 16-06-2018.
 */
public class HumanModel {
    private String name;
    private int legs;
    private int hand;
    private int face;
    private String location;
    private boolean gender;

    public HumanModel(String name, int legs, int hand, int face, String location, boolean gender) {
        this.name = name;
        this.legs = legs;
        this.hand = hand;
        this.face = face;
        this.location = location;
        this.gender = gender;
    }
    public HumanModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
