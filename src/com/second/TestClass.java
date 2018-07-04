package com.second;

import ClassObj.AccessModifier;

/**
 * Created by Anukul-PC on 26-06-2018.
 */
public class TestClass extends AccessModifier {


    public static void main(String[] args) {
        int ans = 100;
        System.out.println("int : " + ans);


        Integer integer = new Integer(10);
        System.out.println(integer.byteValue());

        System.out.println("INTEGER : " + integer);
    }
}
