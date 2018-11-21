package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double resultAdd = calculator.add(1,2);
        Double resultSub = calculator.sub(2,1);
        Double resultMul = calculator.mul(2,2);
        Double resultDiv = calculator.div(2,2);
        //Then
        Assert.assertEquals(3, resultAdd, 0);
        Assert.assertEquals(1, resultSub, 0);
        Assert.assertEquals(4, resultMul,0);
        Assert.assertEquals(1, resultDiv,0);
    }
}
