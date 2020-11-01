package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuild(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame seeds")
                .burgers(2)
                .sauce("garlic")
                .ingredients("bacon")
                .ingredients("lettuce")
                .ingredients("pickled cucumber")
                .ingredients("onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);

    }
}
