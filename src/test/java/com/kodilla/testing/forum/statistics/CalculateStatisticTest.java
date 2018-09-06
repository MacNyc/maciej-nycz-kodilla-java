package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTest {
    @Test
    public void testUserQuantity() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames();

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);

        int userQuantity = calculateStatistic.calculateAdvStatistics().size();


    }

    @Test
    public void testPostQuantity() {

    }

    @Test
    public void testCommentQuantity() {
    }

    @Test
    public void testAvgPostPerUser() {
    }

    @Test
    public void testAvgCommentPerUser() {
    }

    @Test
    public void testAvgCommentPerPost() {
    }
}
