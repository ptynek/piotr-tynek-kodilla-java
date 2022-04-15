package com.kodilla.testing.forum.statistics;


import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommentsAndPostsTestSuite {

    @Mock
    private Statistics statisticsMock;

    List<String> generateUsersList(int quantity){
        List<String> theList = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            theList.add("User" + i);
        }
        return theList;
    }

    @Test
    void testAverageAmountOfPostsForUserWhen0Posts(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(0.0, commentsAndPosts.getPostsAverageForUsers());

    }

    @Test
    void testAverageAmountOfPostsForUserWhen1000Posts(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(10.0, commentsAndPosts.getPostsAverageForUsers());
    }

    @Test
    void testAverageAmountOfCommentsForUserWhen0Comments(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(0, commentsAndPosts.getCommentsAverageForUsers());
    }

    @Test
    void testAverageAmountOfCommentsForPostsWhenMorePosts(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(0.0, commentsAndPosts.getAverageAmountOfCommentsForPost());
    }

    @Test
    void testAverageAmountOfCommentsForPostsWhenMoreComments() {
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(10.0, commentsAndPosts.getAverageAmountOfCommentsForPost());
    }

    @Test
    void testAverageAmountOfPostsWhen0Users(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        List<String> usersList = generateUsersList(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(0, commentsAndPosts.getPostsAverageForUsers());
        Assertions.assertEquals(0, commentsAndPosts.getCommentsAverageForUsers());
    }

    @Test
    void testAverageAmountOfPostsWhen100Users(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        commentsAndPosts.calculateAdvStatistics(statisticsMock);

        Assertions.assertEquals(1, commentsAndPosts.getPostsAverageForUsers());
        Assertions.assertEquals(1, commentsAndPosts.getCommentsAverageForUsers());
    }

    @Test
    void testShowStatistics(){
        CommentsAndPosts commentsAndPosts = new CommentsAndPosts(statisticsMock);
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        commentsAndPosts.showStatistics();

        Assertions.assertEquals("100, 100, 1000, 1.0, 10.0, 10.0",commentsAndPosts.showStatistics());
    }
}



