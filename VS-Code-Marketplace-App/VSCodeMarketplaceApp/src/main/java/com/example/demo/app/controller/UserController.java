package com.example.demo.app.controller;

import com.example.demo.app.models.bindingModels.LoginBindingModel;
import com.example.demo.app.models.serviceModels.LoginServiceModel;
import com.example.demo.app.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(LoginBindingModel loginBindingModel) {
        boolean successfulLogin = userService.login(
                new LoginServiceModel()
                        .setEmail(loginBindingModel.getEmail())
                        .setPassword(loginBindingModel.getPassword())
        );

        if (successfulLogin) {
            return "redirect:/";
        }
        return "redirect:/login";
    }
}
