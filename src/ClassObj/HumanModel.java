package ClassObj;

/**
 * Created by Anukul-PC on 16-06-2018.
 */
public class HumanModel {
    public HumanModel(int legs, int hand, int face, String location, String gender) {
        this.legs = legs;
        this.hand = hand;
        this.face = face;
        this.location = location;
        this.gender = gender;
    }

    private int legs;
    private int hand;
    private int face;
    private String location;
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
