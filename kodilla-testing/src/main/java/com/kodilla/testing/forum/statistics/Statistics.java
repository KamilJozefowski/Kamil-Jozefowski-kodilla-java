package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Statistics implements StatisticsInterface {
    Statistics statistics;
    private Double avgPostsPerUser;
    private Double avgCommentPerUser;
    private Double avgCommentPerPost;

    public Statistics (Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        if (statistics.usersNames().size() == 0 || statistics.postsCount() == 0){
            avgPostsPerUser = 0.0;
        }else{
            avgPostsPerUser = (double)statistics.postsCount()/ statistics.usersNames().size();
        }

        if (statistics.usersNames().size() == 0 || statistics.commentsCount() == 0){
            avgCommentPerUser = 0.0;
        }else{
            avgCommentPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
        }

        if (statistics.commentsCount() == 0 || statistics.postsCount() == 0){
            avgCommentPerPost = 0.0;
        }else{
            avgCommentPerPost = (double)statistics.commentsCount() / statistics.postsCount();
        }

    }
    public void showAdvStatistics(){
        System.out.println("Average number of posts per user:" + avgPostsPerUser);
        System.out.println("Average number of comments per user:" + avgCommentPerUser);
        System.out.println("Average number of comments per post:" + avgCommentPerPost);
    }

    public Double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public Double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public Double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    @Override
    public List<String> usersNames() {
        return statistics.usersNames();
    }

    @Override
    public int postsCount() {
        return statistics.postsCount();
    }

    @Override
    public int commentsCount() {
        return statistics.commentsCount();
    }
}
