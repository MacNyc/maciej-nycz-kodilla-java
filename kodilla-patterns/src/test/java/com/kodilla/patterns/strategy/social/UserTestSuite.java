package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User lukasz = new Millenials("Lukasz");
        User maciej = new YGeneration("Maciej");
        User maria = new ZGeneration("Maria");

        //When
        String lukaszShareOn = lukasz.sharePost();
        System.out.println("Lukasz share post on: " + lukaszShareOn);
        String maciejShareOn = maciej.sharePost();
        System.out.println("Maciej share post on: " + maciejShareOn);
        String mariaShareOn = maria.sharePost();
        System.out.println("Maria share post on: " + maciejShareOn);

        //Then
        Assert.assertEquals("Twitter", lukaszShareOn);
        Assert.assertEquals("Facebook", maciejShareOn);
        Assert.assertEquals("Snapchat", mariaShareOn);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User lukasz = new Millenials("Lukasz");

        //When
        String lukaszshareOn = lukasz.sharePost();
        System.out.println("Lukasz share post on: " + lukaszshareOn);
        lukasz.setWhereToShare(new FacebookPublisher());
        lukaszshareOn = lukasz.sharePost();
        System.out.println("Lukasz now share post on: " + lukaszshareOn);

        //Then
        Assert.assertEquals("Facebook", lukaszshareOn);
    }
}
