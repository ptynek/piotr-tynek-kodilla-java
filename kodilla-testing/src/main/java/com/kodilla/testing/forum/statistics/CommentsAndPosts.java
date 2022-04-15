package com.kodilla.testing.forum.statistics;

public class CommentsAndPosts {

    private Statistics statistics;

    private int amountOfUsers;
    private int amountOfPosts;
    private int amountOfComments;
    private double postsAverageForUsers;
    private double commentsAverageForUsers;
    private double averageAmountOfCommentsForPost;



    public CommentsAndPosts(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        amountOfUsers = statistics.usersNames().size();
        amountOfComments = statistics.commentsCount();
        amountOfPosts = statistics.postsCount();

        if (amountOfUsers > 0){
            postsAverageForUsers = amountOfPosts / amountOfUsers;
            commentsAverageForUsers = amountOfComments / amountOfUsers;
        }

        if (amountOfPosts > 0){
            averageAmountOfCommentsForPost = amountOfComments / amountOfPosts;
        }
    }

    public String showStatistics() {
        calculateAdvStatistics(statistics);
        return amountOfUsers + ", " + amountOfPosts + ", " + amountOfComments + ", " + postsAverageForUsers + ", " +
                commentsAverageForUsers + ", " + averageAmountOfCommentsForPost;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public void setAmountOfUsers(int amountOfUsers) {
        this.amountOfUsers = amountOfUsers;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    public void setAmountOfPosts(int amountOfPosts) {
        this.amountOfPosts = amountOfPosts;
    }

    public int getAmountOfComments() {
        return amountOfComments;
    }

    public void setAmountOfComments(int amountOfComments) {
        this.amountOfComments = amountOfComments;
    }

    public double getPostsAverageForUsers() {
        return postsAverageForUsers;
    }

    public void setPostsAverageForUsers(double postsAverageForUsers) {
        this.postsAverageForUsers = postsAverageForUsers;
    }

    public double getCommentsAverageForUsers() {
        return commentsAverageForUsers;
    }

    public void setCommentsAverageForUsers(double commentsAverageForUsers) {
        this.commentsAverageForUsers = commentsAverageForUsers;
    }

    public double getAverageAmountOfCommentsForPost() {
        return averageAmountOfCommentsForPost;
    }

    public void setAverageAmountOfCommentsForPost(double averageAmountOfCommentsForPost) {
        this.averageAmountOfCommentsForPost = averageAmountOfCommentsForPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsAndPosts that = (CommentsAndPosts) o;

        if (amountOfUsers != that.amountOfUsers) return false;
        if (amountOfPosts != that.amountOfPosts) return false;
        if (amountOfComments != that.amountOfComments) return false;
        if (Double.compare(that.postsAverageForUsers, postsAverageForUsers) != 0) return false;
        if (Double.compare(that.commentsAverageForUsers, commentsAverageForUsers) != 0) return false;
        if (Double.compare(that.averageAmountOfCommentsForPost, averageAmountOfCommentsForPost) != 0)
            return false;
        return statistics.equals(that.statistics);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = statistics.hashCode();
        result = 31 * result + amountOfUsers;
        result = 31 * result + amountOfPosts;
        result = 31 * result + amountOfComments;
        temp = Double.doubleToLongBits(postsAverageForUsers);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(commentsAverageForUsers);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageAmountOfCommentsForPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
