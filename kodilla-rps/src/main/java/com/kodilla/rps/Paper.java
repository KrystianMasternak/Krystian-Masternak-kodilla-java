package com.kodilla.rps;

public class Paper implements Thing {

    public String getNameThing(){
        return "You chose PAPER";
    }


    public String toString(){
        return getNameThing();
    }
}
