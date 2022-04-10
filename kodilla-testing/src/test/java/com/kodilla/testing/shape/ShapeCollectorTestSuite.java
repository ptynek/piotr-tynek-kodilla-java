package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.*;
import java.awt.*;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start testing...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Nested
    @DisplayName("Modify figures")
    class ModifyFigures {
        @Test
        void testAddFigure() {
            Shape square = new Square("square", 5);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(square);

            Assertions.assertEquals(1, shapeCollector.figures.size());
        }

        @Test
        void testRemoveFigure() {
            Shape square = new Square("square", 5);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            boolean result = shapeCollector.removeFigure(square);

            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.figures.size());
        }
    }

    @Nested
    @DisplayName("Show figures")
    class ShowFigures {
        @Test
        void testGetFigure() {
            Shape square = new Square("square", 5);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            Shape shape = shapeCollector.figures.get(0);

            Assertions.assertEquals(square, shape);
        }

        @Test
        void testGetFuigureNotExisting() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape result = shapeCollector.getFigure(-11);

            Assertions.assertNull(result);
        }

        @Test
        void testShowFigure() {
            Shape square = new Square("square", 5);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            String result = shapeCollector.showFigures();

            Assertions.assertEquals(result, square.getShapeName());
        }
    }
}
