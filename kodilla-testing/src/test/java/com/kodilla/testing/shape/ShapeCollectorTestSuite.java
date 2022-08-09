package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

        @Test
    void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(4);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeList().size());
        }

        @Test
    void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(4);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
        }

        @Test
    void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(4);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Than
            Assertions.assertEquals(shape, retrievedShape);
        }
        @Test
    void testShowFigures(){
        //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(4);
            shapeCollector.addFigure(shape);
            ArrayList<Shape> shapeList1 = new ArrayList<>();
            shapeList1.add(shape);
        //When
            List<Shape> shapeResultList = shapeCollector.getShapeList();
        //Than
            Assertions.assertEquals(shapeList1.toString(), shapeResultList.toString());
    }
}
