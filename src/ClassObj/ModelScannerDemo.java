package ClassObj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 21-06-2018.
 */
public class ModelScannerDemo {

    private ArrayList<PersonModel> personModels;
    private Scanner scanner;

    ModelScannerDemo() {
        personModels = new ArrayList<>();
        scanner = new Scanner(System.in);
        addElement();
    }

    private void addElement() {

        final int leg;
        final int hand;
        final int face;
        final String location;
        final String gender;

        System.out.println("Enter your Leg : ");
        leg = scanner.nextInt();

        System.out.println("Enter your hand : ");
        hand = scanner.nextInt();

        System.out.println("Enter your Face : ");
        face = scanner.nextInt();

        System.out.println("Enter Your location : ");
        location = scanner.next();


        System.out.println("Enter your Gender : ");
        gender = scanner.next();


        personModels.add(new PersonModel(leg, hand, face, location, gender));

        System.out.println(personModels.get(0).getPersonLocation());
    }




}
