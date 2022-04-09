package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the begining of tests");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test#" + testCounter);
    }

    @Nested
    @DisplayName("Test for posts")
    class TestPosts{
        @Test
        void testAddPost(){
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

            //When
            forumUser.addPost("mrsmith",
                    "Hello everyone, this is my first contribution here!");

            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }

        @Test
        void testGetPost(){
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone," +
                    "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);

            Assertions.assertEquals(thePost, retrievedPost);
        }

        @Test
        void testRemovePostNotExisting(){
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone," +
                    "this is my first contribution here!", "mrsmith");

            boolean result = forumUser.removePost(thePost);

            Assertions.assertFalse(result);
        }

        @Test
        void testRemovePost(){
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone," +
                    "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            boolean result = forumUser.removePost(thePost);

            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestComments {

        @Test
        void testAddComment() {
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");

            forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }


        @Test
        void testGetComment() {
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone," +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank your for all good words", "mrsmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            ForumComment retrievedComment = forumUser.getComment(0);

            Assertions.assertEquals(theComment, retrievedComment);
        }


        @Test
        void testRemoveCommentNotExisting() {
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone," +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank your for all good words", "mrsmith");

            boolean result = forumUser.removeComment(theComment);

            Assertions.assertFalse(result);
        }


        @Test
        void testRemoveComment() {
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone," +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank your for all good words", "mrsmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            boolean result = forumUser.removeComment(theComment);

            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
}
