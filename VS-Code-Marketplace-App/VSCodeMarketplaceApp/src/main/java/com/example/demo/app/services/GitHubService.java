package com.example.demo.app.services;


import com.example.demo.app.models.entityModels.GitHubModel;

import java.io.IOException;

public interface GitHubService {
//    GitHub connect() throws IOException;
    GitHubModel getGitHubInfo(String repoLink) throws IOException;
}
