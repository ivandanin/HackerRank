package com.example.demo.app;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {

    private boolean loggedIn;
    private String email;


    public boolean isLoggedIn() {
        return loggedIn;
    }

    public CurrentUser setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CurrentUser setEmail(String email) {
        this.email = email;
        return this;
    }
}
