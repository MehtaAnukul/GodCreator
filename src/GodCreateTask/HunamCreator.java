package GodCreateTask;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 28-05-2018.
 */
public class HunamCreator {

    public Scanner s;
    ArrayList<HumanModel> humanModelArrayList;

    HunamCreator() {
        s = new Scanner(System.in);
        humanModelArrayList = new ArrayList<>();
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
                    System.out.println("Select the Human which you like to crated");
                    System.out.println("1.Male");
                    System.out.println("2.Female");
                    System.out.println("");
                    System.out.println("Enter your choice");
                    Humanchoice = s.nextInt();
                    switch (Humanchoice) {
                        case 1:
                            HumanCreate(true);
                            choice();
                            break;
                        case 2:
                            HumanCreate(false);
                            choice();
                            break;
                    }
                    break;
                case 2:
                    int Humanlist;
                    System.out.println("");
                    System.out.println("1.Will you see the Male list..?");
                    System.out.println("2.Will you see the Female list..?");
                    System.out.println("3.will you see the perticular users Male list..?");
                    System.out.println("4.will you see the perticular users Female list..?");
                    System.out.println("");
                    System.out.println("choose your choice:");
                    Humanlist = s.nextInt();
                    switch (Humanlist) {
                        case 1:
                            allmalerecord();
                            break;
                        case 2:
                            allfemalerecord();
                            break;
                        case 3:
                            perticularUserMaleList();
                            break;
                        case 4:
                            perticularUserFemaleList();
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

    private void perticularUserFemaleList() {
        int index;

        for (int i = 0; i < humanModelArrayList.size(); i++) {
            if (!humanModelArrayList.get(i).isGender()) {
                System.out.println(i  + "." + humanModelArrayList.get(i).getName());
            }

        }
        System.out.println("");
        System.out.println("Enter the index:");
        index = s.nextInt();
        System.out.println("The Female:" + " " + humanModelArrayList.get(index).getName() + " " + "is that");
        System.out.println("LAGS: " + humanModelArrayList.get(index).getLegs() + " | "
                + "HAND: " + humanModelArrayList.get(index).getHand() + " | "
                + "FACE: " + humanModelArrayList.get(index).getFace() + " | "
                + "LOCATION: " + humanModelArrayList.get(index).getLocation() + " | ");
        choice();
    }

    private void perticularUserMaleList() {
        int index;

        for (int i = 0; i < humanModelArrayList.size(); i++) {
            if (humanModelArrayList.get(i).isGender()) {
                System.out.println(i + "." + humanModelArrayList.get(i).getName());
            }
        }
        System.out.println("");
        System.out.println("Enter the index:");
        index = s.nextInt();
        System.out.println("The Male:" + " " + humanModelArrayList.get(index).getName() + " " + "is that");
        System.out.println("LAGS: " + humanModelArrayList.get(index).getLegs() + " | "
                + "HAND: " + humanModelArrayList.get(index).getHand() + " | "
                + "FACE: " + humanModelArrayList.get(index).getFace() + " | "
                + "LOCATION: " + humanModelArrayList.get(index).getLocation() + " | ");
        choice();
    }

    private void allfemalerecord() {
        for (int i = 0; i < humanModelArrayList.size(); i++) {
            if (!humanModelArrayList.get(i).isGender()) {

                System.out.println("NAME:" + humanModelArrayList.get(i).getName() + " | "
                        + "LAGS:" + humanModelArrayList.get(i).getLegs() + " | "
                        + "HAND:" + humanModelArrayList.get(i).getLegs() + " | "
                        + "FACE:" + humanModelArrayList.get(i).getFace() + " | "
                        + "LOCTION:" + humanModelArrayList.get(i).getLocation());
            }

        }
    }

    private void allmalerecord() {
        for (int i = 0; i < humanModelArrayList.size(); i++) {
            if (humanModelArrayList.get(i).isGender()) {
                System.out.println("NAME:" + humanModelArrayList.get(i).getName() + " | "
                        + "LAGS:" + humanModelArrayList.get(i).getLegs() + " | "
                        + "HAND:" + humanModelArrayList.get(i).getLegs() + " | "
                        + "FACE:" + humanModelArrayList.get(i).getFace() + " | "
                        + "LOCTION:" + humanModelArrayList.get(i).getLocation());
            }
        }

    }

    void HumanCreate(boolean b) {
        final java.lang.String name;
        final int legs;
        final int hand;
        final int face;
        final java.lang.String location;
        final boolean gender;

        System.out.println("Enter the HumanName:");
        name = s.next();
        System.out.println("");
        System.out.println("Enter the HumanParts");
        System.out.println("Enter the Legs:");
        legs = s.nextInt();
        System.out.println("Enter the Hand:");
        hand = s.nextInt();
        System.out.println("Enter the Face:");
        face = s.nextInt();
        System.out.println("Enter the Location");
        location = s.next();

        System.out.println("");
        System.out.println("Just Wait...Hunam will be created in few second..!!");

        humanModelArrayList.add(new sHumanModel(name, legs, hand, face, location, b));
        choice();

    }


}


