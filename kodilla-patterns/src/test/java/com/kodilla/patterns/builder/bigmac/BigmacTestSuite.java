package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("barbecue")
                .bun("with sesame")
                .burgers(4)
                .ingredient("Onion")
                .ingredient("becon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
