package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Check that the even number filtering method is working correctly")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(4);
        normalList.add(7);
        normalList.add(8);
        //When
        List<Integer> normalTestList = exterminator.exterminate(new ArrayList<Integer>(normalList));
        System.out.println("Testing even number list");
        //Then
        Assertions.assertEquals(2, normalTestList.size());
        Assertions.assertEquals(Arrays.asList(4,8), normalTestList);
    }
    @DisplayName("Check that the empty list filtering method is working correctly")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> emptyTestList = exterminator.exterminate(new ArrayList<Integer>(emptyList));
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(0,emptyTestList.size());
    }
}
