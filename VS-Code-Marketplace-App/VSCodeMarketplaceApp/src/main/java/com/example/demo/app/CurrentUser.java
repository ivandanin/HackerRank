package com.example.demo.app;

import com.example.demo.app.models.entityModels.enums.UserRoleEnum;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class CurrentUser {

    private boolean loggedIn;
    private String email;

    private Set<UserRoleEnum> roles = new HashSet<>();


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

    public Set<UserRoleEnum> getRoles() {
        return roles;
    }

    public CurrentUser setRoles(Set<UserRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public CurrentUser addRole(UserRoleEnum roleEnum) {
        roles.add(roleEnum);
        return this;
    }

    public void clean() {
        setLoggedIn(false)
                .setEmail(null)
                .clearRoles();
    }

    private CurrentUser clearRoles() {
        roles.clear();
        return this;
    }
}
