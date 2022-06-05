package com.example.demo.app.models;

import java.util.Date;

public class GitHubModel {

    private int numberOfIssues;
    private int numberOfPullRequests;
    private Date lastCommitDate;

    public GitHubModel(int numberOfIssues, int numberOfPullRequests, Date lastCommitDate) {
        this.numberOfIssues = numberOfIssues;
        this.numberOfPullRequests = numberOfPullRequests;
        this.lastCommitDate = lastCommitDate;
    }

    public int getNumberOfIssues() {
        return numberOfIssues;
    }

    public GitHubModel setNumberOfIssues(int numberOfIssues) {
        this.numberOfIssues = numberOfIssues;
        return this;
    }

    public int getNumberOfPullRequests() {
        return numberOfPullRequests;
    }

    public GitHubModel setNumberOfPullRequests(int numberOfPullRequests) {
        this.numberOfPullRequests = numberOfPullRequests;
        return this;
    }

    public Date getLastCommitDate() {
        return lastCommitDate;
    }

    public GitHubModel setLastCommitDate(Date lastCommitDate) {
        this.lastCommitDate = lastCommitDate;
        return this;
    }
}
