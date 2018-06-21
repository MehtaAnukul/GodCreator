package ClassObj;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 28-05-2018.
 */
public class HunamCreator {

    private int legs;
    private int hand;
    private int face;
    private String location;
    private String gender;
    private HumanModel humanModel;


    public Scanner s;

    HunamCreator() {
        s = new Scanner(System.in);
        choice();
    }

    public void choice() {
        int ChoiceNo;
        while (true) {
            System.out.println("choice");
            System.out.println("1.Human Created");
            System.out.println("2.Human Created list");
            System.out.println("3.Exit");
            System.out.println("");
            System.out.println("select the choice no");
            ChoiceNo = s.nextInt();
            switch (ChoiceNo) {
                case 1:
                    int Humanchoice;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Select the Human which you like to crated");
                    System.out.println("1.Male");
                    System.out.println("2.Female");
                    System.out.println("");
                    System.out.println("Enter your choice");
                    Humanchoice = sc.nextInt();
                    switch (Humanchoice) {
                        case 1:
                            male();
                            break;
                        case 2:
                            female();
                            break;
                    }
                    break;
                case 2:
                    int Humanlist;
                    Scanner s_Humanlist = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("1.Will you see the Male list..?");
                    System.out.println("2.Will you see the Female list..?");
                    Humanlist = s_Humanlist.nextInt();
                    switch (Humanlist) {
                        case 1:
                            //malerecord();
                            break;
                        case 2:
                           // femalerecord();
                            break;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter num is not a choice");
                    break;
            }
        }
    }

   //HunamCreator human[] = new HunamCreator[];
    String human[] ;
    String newItem;


//    String temphuman[] = new String[newSize];




    void male() {
        //int legs, hand, face;
        System.out.println("Enter the MaleParts");
        System.out.println("Enter the legs:");
        legs = s.nextInt();
        System.out.println("Enter the hand:");
        hand = s.nextInt();
        System.out.println("Enter the face:");
        face = s.nextInt();
        System.out.println("");
        System.out.println("Just Wait...Male will be created in few second..!!");

//        humanModel = new HumanModel(legs, hand, face, location, gender);

        System.out.println(humanModel.getLegs());
        System.out.println(humanModel.getHand());
        System.out.println(humanModel.getFace());
    }

    public void malerecord(int lengs, int hand, int face, String location, String gender) {
        this.legs = lengs;
        this.hand = hand;
        this.face = face;
        this.location = location;
        this.gender = gender;
    }

    void female() {
        //int legs, hand, face;
        System.out.println("Enter the femaleParts");
        System.out.println("Enter the leang:");
        legs = s.nextInt();
        System.out.println("Enter the hand:");
        hand = s.nextInt();
        System.out.println("Enter the face:");
        face = s.nextInt();
        System.out.println("Enter the location");

        System.out.println("");
        System.out.println("Just wait...Female will be created in few second..!!");

//        humanModel = new  HumanModel(legs,hand,face,location,gender);
        System.out.println(humanModel.getFace());
    }

    void femalerecord(int lengs, int hand, int face, String location, String gender) {
        this.legs = lengs;
        this.hand = hand;
        this.face = face;
        this.location = location;
        this.gender = gender;
    }
}

