package com.kodilla.rps;

public class Scissors implements Thing{

    public String getNameThing(){
        return "You chose SCISSORS";
    }

    @Override
    public String toString() {
        return getNameThing();
    }
}
