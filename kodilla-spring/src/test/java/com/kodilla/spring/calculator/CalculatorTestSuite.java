package com.kodilla.spring.calculator;

import com.kodilla.spring.caculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 12.00;
        double b = 2.00;

        //When
        double result = calculator.add(a, b);
        double result1 = calculator.sub(a, b);
        double result2 = calculator.mul(a, b);
        double result3 = calculator.div(a, b);

        //Then
        assertEquals(14, result);
        assertEquals(10, result1);
        assertEquals(24, result2);
        assertEquals(6, result3);
    }



}
