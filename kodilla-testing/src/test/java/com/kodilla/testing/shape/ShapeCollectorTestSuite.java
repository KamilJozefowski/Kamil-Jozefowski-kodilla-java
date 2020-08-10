package com.kodilla.testing.shape;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
class ShapeCollectorTestSuite {

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

    @Nested
    @DisplayName("Test for shape")
    class TestShape{

        @Test
        void testAddFigure(){
            //Given
            Shape shape = new Shape("circle", 8);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeQuantity());

        }

        @Test
        void testRemoveFigure(){
            //Given
            Shape shape = new Shape("circle", 8);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(shape);
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertTrue(result);

        }

        @Test
        void testGetFigure(){
            //Given
            Shape shape = new Shape("circle", 8);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(shape);
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(retrievedShape, shape);

        }

        @Test
        void testShowFigures(){
            //Given
            Shape shape = new Shape("circle", 8);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(shape);
            boolean result =  shapeCollector.showFigures();

            //Then
            Assertions.assertTrue(result);

        }
    }


}
