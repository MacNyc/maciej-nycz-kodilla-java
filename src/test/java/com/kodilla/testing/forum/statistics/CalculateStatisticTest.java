package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTest {

    static int testCounter = 0;

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest(){
        testCounter++;
        System.out.println("Test executed");
    }

    // Posts = 0
    @Test
    public void testAvgPostPerUser1() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int postQuantitiy = calculateStatistic.getPostQuantitiy();

        Assert.assertEquals(0, postQuantitiy);

        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(),0);
        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(),0 );
    }

    // Posts = 1000
    @Test
    public void testAvgPostPerUser2() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int postQuantitiy = calculateStatistic.getPostQuantitiy();

        Assert.assertEquals(1000, postQuantitiy);

        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(),0 );
        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(), 0);
    }

    // Comment = 0
    @Test
    public void testCommentQuantity() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int commentsQuantitiy = calculateStatistic.getCommentQuantitiy();

        //Then
        Assert.assertEquals(0, commentsQuantitiy);

        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(), 0);
        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(), 0);
    }

    // Comments > Posts
    @Test
    public void testCommentsPost1(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int postQuantity = calculateStatistic.getPostQuantitiy();
        int commentsQuantity = calculateStatistic.getCommentQuantitiy();

        Assert.assertEquals(0, postQuantity);
        Assert.assertEquals(0, commentsQuantity);

        Assert.assertEquals(0, calculateStatistic.getAvgCommentPerUser(),0);
        Assert.assertEquals(0, calculateStatistic.getAvgCommentPerPost(),0);
    }

    // Comments < Posts
    @Test
    public void testCommentsPost2(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int postQuantity = calculateStatistic.getPostQuantitiy();
        int commentsQuantity = calculateStatistic.getCommentQuantitiy();

        Assert.assertEquals(0, postQuantity);
        Assert.assertEquals(0, commentsQuantity);

        Assert.assertEquals(0, calculateStatistic.getAvgCommentPerUser(),0);
        Assert.assertEquals(0, calculateStatistic.getAvgCommentPerPost(),0);
    }

    // User = 0
    @Test
    public void testUserQuantity1() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(namesList);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int quantityOfUsers = calculateStatistic.getUserQuantity();

        //Then
        Assert.assertEquals(0, quantityOfUsers);

        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(),0);
        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(),0 );
    }

    // User = 100
    @Test
    public void testUserQuantity2() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            namesList.add("firstUser");
        }
        when(statisticsMock.usersNames()).thenReturn(namesList);
        when(statisticsMock.postsCount()).thenReturn(20);

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        int quantityOfUsers = calculateStatistic.getUserQuantity();

        Assert.assertEquals(100, quantityOfUsers);

        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(), 0);
        Assert.assertEquals(0, calculateStatistic.getAvgPostPerUser(), 0);
    }
}