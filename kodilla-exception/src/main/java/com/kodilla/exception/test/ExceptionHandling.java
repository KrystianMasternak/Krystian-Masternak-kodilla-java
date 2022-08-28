package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowExcepion(2.5,1.5);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }
    }
}
