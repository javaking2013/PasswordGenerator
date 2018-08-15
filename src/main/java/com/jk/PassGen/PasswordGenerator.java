package com.jk.PassGen;

/* *************************************************************************************
Author: Patrick Meadows
Date: 14Aug2018
Taken From: https://github.com/javaking2013/PasswordGenerator
************************************************************************************** */

import java.util.Random;

public class PasswordGenerator {

    /* ********************* Only Change These Values ******************************** */
    private static final boolean containsCharacters = true;
    private static final boolean containsMixedCase = true;
    private static final boolean containsNumbers = true;
    private static final boolean doubleWeightCharacters = true;
    private static final int length = 32;
    /* ******************************************************************************* */

    private static final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "1234567890";
    private static final String characters = "?!@$&";
    private static String charPool = "";

    public static void main(String[] args){
        if(containsMixedCase){ charPool = upperCase + lowerCase; }
        else{ charPool = lowerCase; }

        if(containsCharacters){ charPool += characters; }
        if(containsNumbers){ charPool += numbers; }
        if(doubleWeightCharacters && containsCharacters){ charPool += characters; }

        System.out.println(generateRandomValue(length));
    }

    // use this method to generate any random string, substitute string for charPool
    private static String generateRandomValue(int s){
        char[] value = charPool.toCharArray();
        Random rand = new Random();
        String result = "";
        for(int i = 0; i < s; i++){
            result += value[rand.nextInt(value.length)];
        }
        return result;
    }
}
