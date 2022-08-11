package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    void testBasicPizzaOrderGetCost(){
        PizzaOrder theOrder = new BasicPizzaOrder();

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    void testBasicPizzaOrderGetDescription(){
        PizzaOrder theOrder = new BasicPizzaOrder();

        String description = theOrder.getDescription();

        assertEquals("Order a pizza with cheese and tomato sauce", description);
    }

    @Test
    void testPizzaOrderWithExtraCheeseGetCost(){
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(25) , theCost);
    }

    @Test
    void testPizzaOrderWithExtraCheeseGetDescription(){
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Order a pizza with cheese and tomato sauce + extra cheese", description);
    }

    @Test
    void testPizzaOrderWithAllIngredientsGetCost(){
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);
        theOrder = new Corn(theOrder);
        theOrder = new Onion(theOrder);
        theOrder = new Pepper(theOrder);
        theOrder = new Mushrooms(theOrder);
        theOrder = new Salami(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(54), theCost);

    }

    @Test
    void testPizzaOrderWithAllIngredientsGetDescription(){
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);
        theOrder = new Corn(theOrder);
        theOrder = new Onion(theOrder);
        theOrder = new Pepper(theOrder);
        theOrder = new Mushrooms(theOrder);
        theOrder = new Salami(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Order a pizza with cheese and tomato sauce + extra cheese " +
                "+ corn + onion + peppers + mushrooms + salami", description);
    }

}