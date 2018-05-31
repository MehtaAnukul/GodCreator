package ClassObj;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 28-05-2018.
 */
public class HunamCreator {

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

    void male() {
        int l, h, f;
        System.out.println("Enter the MaleParts");
        System.out.println("Enter the legs:");
        l = s.nextInt();
        System.out.println("Enter the hand:");
        h = s.nextInt();
        System.out.println("Enter the face:");
        f = s.nextInt();
        System.out.println("Just Wait...Male will be created in few second..!!");
    }

    void malerecord() {
//        System.out.println("The leang is:"+l);
    }

    void female() {
        int l, h, f;
        System.out.println("Enter the femaleParts");
        System.out.println("Enter the leang:");
        l = s.nextInt();
        System.out.println("Enter the hand:");
        h = s.nextInt();
        System.out.println("Enter the face:");
        f = s.nextInt();
        System.out.println("Just wait...Female will be created in few second..!!");
    }

    void femalerecord() {

    }
}

