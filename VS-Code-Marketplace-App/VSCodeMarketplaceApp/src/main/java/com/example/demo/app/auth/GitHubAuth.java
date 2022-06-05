package com.example.demo.app.auth;

import java.util.Scanner;

public class GitHubAuth {
    Scanner scanner = new Scanner(System.in);

    String user = "";
    String pass = "";

    public String getUser() {
        return user;
    }

    public GitHubAuth setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public GitHubAuth setPass(String pass) {
        this.pass = pass;
        return this;
    }
}
