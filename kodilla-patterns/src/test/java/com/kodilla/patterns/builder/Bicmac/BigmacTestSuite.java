package com.kodilla.patterns.builder.Bicmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame")
                .ingredient("onion")
                .ingredient("salad")
                .sauce("barbecue")
                .ingredient("pickles")
                .burgers(3)
                .ingredient("mushrooms")
                .build();

        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        String whatSauce = bigmac.getSauce();

        //Then
        assertEquals(3,howManyBurgers);
        assertEquals(4, howManyIngredients);
        assertEquals("barbecue", whatSauce);

    }
}
