package com.example.demo.app.services.impl;

import com.example.demo.app.models.GitHubModel;
import com.example.demo.app.services.GitHubService;
import com.example.demo.app.auth.GitHubAuth;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class GitHubServiceImpl implements GitHubService {


//    @Override
//    public GitHub connect() throws IOException {
//        return new GitHubBuilder()
//                .withOAuthToken("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").build();
//    }

    @Override
    public GitHubModel getGitHubInfo(String repoLink) throws IOException {
        GitHub gitHub = new GitHubBuilder().withPassword(new GitHubAuth().getUser(), new GitHubAuth().getPass()).build();
        GHRepository repository = gitHub.getRepository(repoLink);

        int numberOfIssues = repository.getOpenIssueCount();

        int numberOfPullRequests = repository
                .getPullRequests(GHIssueState.OPEN)
                .size();

        Date lastCommitDate = repository
                .listCommits()
                .toList()
                .stream()
                .findFirst()
                .get()
                .getCommitDate();

        return new GitHubModel(numberOfIssues, numberOfPullRequests, lastCommitDate);
    }
}
