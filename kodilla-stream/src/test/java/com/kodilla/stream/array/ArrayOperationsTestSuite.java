package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int numbers [] = {1,3,46,8,4,33,2,1,45,87,99,12};

        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        double expectedAverage = 28.41666;
        assertEquals(expectedAverage, average, 0.00001);


    }
}
