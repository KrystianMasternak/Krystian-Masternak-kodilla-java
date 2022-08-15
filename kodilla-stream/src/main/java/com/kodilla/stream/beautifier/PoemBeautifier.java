package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String a, PoemDecorator poemDecorator){
        return poemDecorator.decorate(a);
    }
}
