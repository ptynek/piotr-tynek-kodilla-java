package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacNew(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Bacon")
                .ingredient("Onion")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        String bunType = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();

        assertEquals(3, howManyIngredients);
        assertEquals("Sesame", bunType);
        assertEquals(2, howManyBurgers);
        assertEquals("Barbecue", whatSauce);
    }
}
