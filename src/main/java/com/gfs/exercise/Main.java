package com.gfs.exercise;

public class Main {

    public static void main(String[] args) {

        final Isogram isogram = new Isogram();
        String testString = "DigeryDon't";

        System.out.println(testString + " is an isogram = " + isogram.determineIsAnIsogram(testString));

    }
}
