package com.kodilla;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);

        String name = shape.getShapeName();

        assertEquals("This is a circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);

        String name = shape.getShapeName();

        assertEquals("This is a triangle.", name);
    }

    @Test
    void testSquareLoadedIntoContainer(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);

        String name = shape.getShapeName();

        assertEquals("This is a square.", name);
    }

    @Test
    void  testShapeLoadedIntoContainer(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");

        String name = shape.getShapeName();

        System.out.println("Chosen shape says: " + name);
    }

}
