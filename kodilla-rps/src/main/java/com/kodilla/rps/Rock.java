package com.kodilla.rps;

public class Rock implements Thing{

    @Override
    public String getNameThing() {
        return "You chose STONE";
    }

    @Override
    public String toString() {
        return getNameThing();
    }
}
