package com.kodilla.spring.caculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double val) {
        System.out.println(val);
    }
}
