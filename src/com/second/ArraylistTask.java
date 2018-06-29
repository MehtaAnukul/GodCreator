package com.second;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anukul-PC on 26-06-2018.
 */
public class ArraylistTask {
    public ArraylistTask() {
        final ArrayList<Integer> arrayList = new ArrayList<>();
        insertvalue(arrayList);

    }

    private void insertvalue(ArrayList<Integer> arrayList) {
        Scanner element = new Scanner(System.in);
        final int a;
        System.out.println("Enter the element:");
        a = element.nextInt();
        arrayList.add(a);
        displayvalue(arrayList);
    }

    private void displayvalue(ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        insertvalue(arrayList);
    }
}
