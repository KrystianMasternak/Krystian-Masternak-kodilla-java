package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //System.out.println("Calculating expressions with lambdas");
        //expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        //PoemBeautifier poemBeautifier = new PoemBeautifier();

        //String text1 = poemBeautifier.beautify("HELLO!", (a -> a.toLowerCase()));
        //System.out.println(text1);

        //String text2 = poemBeautifier.beautify("The earth ", (a -> a.concat("is ").concat("round!!")));
        //System.out.println(text2);

        //String text3 = poemBeautifier.beautify("World is beautiful", (a -> a.toUpperCase()));
        //System.out.println(text3);

        //String text4 = poemBeautifier.beautify("PoemBeautifier", (a -> a.substring(4,14)));
        //System.out.println(text4);

        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);



    }
}
