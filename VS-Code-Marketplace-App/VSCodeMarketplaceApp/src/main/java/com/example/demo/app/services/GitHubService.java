package com.example.demo.app.services;


import com.example.demo.app.models.GitHubModel;
import org.kohsuke.github.GitHub;

import java.io.IOException;

public interface GitHubService {
//    GitHub connect() throws IOException;
    GitHubModel getGitHubInfo(String repoLink) throws IOException;
}
