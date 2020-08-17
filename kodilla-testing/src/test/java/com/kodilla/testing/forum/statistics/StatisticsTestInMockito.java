package com.kodilla.testing.forum.statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestInMockito {

    private static int testCounter = 0;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++){
            resultList.add("User"+ n);
        }
        return resultList;
    }

    @Mock
    private static Statistics statisticsMock;

    @BeforeEach
    public void beforeAllTests() {
        /*List<String> usersNames0 = generateListOfNUsers(0);
        //Statistics statisticsPosts0Comments0User0 = new Statistics(usersNames0,0, 0);
        Statistics statisticsPosts1000Comments0User0 = new Statistics(usersNames0,1000, 0);
        Statistics statisticsPosts0Comments10User0 = new Statistics(usersNames0,0, 10);
        Statistics statisticsPosts1000Comments10User0 = new Statistics(usersNames0,1000, 10);
        Statistics statisticsPosts1000Comments1200User0 = new Statistics(usersNames0,1000, 1200);
        List<String> usersNames100 = generateListOfNUsers(100);
        Statistics statisticsPosts0Comments0User100 = new Statistics(usersNames100,0, 0);
        Statistics statisticsPosts1000Comments0User100 = new Statistics(usersNames100,1000, 0);
        Statistics statisticsPosts0Comments10User100 = new Statistics(usersNames100,0, 10);
        Statistics statisticsPosts1000Comments10User100 = new Statistics(usersNames100,1000, 10);
        Statistics statisticsPosts1000Comments1200User100 = new Statistics(usersNames100,1000, 1200);*/

        ++testCounter;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }


    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
        System.out.println("-------------------------------------");
    }

    @Test
    void testCalculateAdvStatisticsPosts0Comments0User0(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames0 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts0Comments10User0(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames0 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000Comments0User0(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames0 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000Comments10User0(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames0 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0.01, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000Comments1200User0(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames0 = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1200);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(1.2, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts0Comments0User100(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames100 = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames100);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000Comments0User100(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames100 = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(10, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts0Comments10User100(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames100 = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames100);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.1, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000Comments10User100(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames100 = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(10, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.1, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(0.01, statistics.getAvgCommentPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000Comments1200User100(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames100 = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1200);

        // When
        Statistics statistics = new Statistics(statisticsMock);
        statistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(10, statistics.getAvgPostsPerUser());
        Assertions.assertEquals(12, statistics.getAvgCommentPerUser());
        Assertions.assertEquals(1.2, statistics.getAvgCommentPerPost());
    }

}
