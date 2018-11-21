package com.kodilla.testing.forum.statistics;



public class CalculateStatistic {

    private int userQuantity;
    private int postQuantitiy;
    private int commentQuantitiy;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public CalculateStatistic() {

    }

    public CalculateStatistic(Statistics statisticsMock) {
    }


    public void calculateAdvStatistics(Statistics statistics) {

        this.userQuantity = statistics.usersNames().size();
        this.postQuantitiy = statistics.postsCount();
        this.commentQuantitiy = statistics.commentsCount();

        if (userQuantity == 0) {

        }else{
            this.avgPostPerUser = postQuantitiy / userQuantity;
            this.avgCommentPerUser = commentQuantitiy / userQuantity;
        }

        if (postQuantitiy == 0) {

        }else{
            this.avgCommentPerPost = commentQuantitiy / postQuantitiy;
        }

    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantitiy() {
        return postQuantitiy;
    }

    public int getCommentQuantitiy() {
        return commentQuantitiy;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}