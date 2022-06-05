package com.example.demo.app.services.impl;

import com.example.demo.app.CurrentUser;
import com.example.demo.app.models.User;
import com.example.demo.app.models.UserRole;
import com.example.demo.app.models.serviceModels.LoginServiceModel;
import com.example.demo.app.repositories.UserRepository;
import com.example.demo.app.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    @Override
    public boolean login(LoginServiceModel loginServiceModel) {

        Optional<User> optionalUser = userRepository.findByEmail(loginServiceModel.getEmail());

        if (optionalUser.isEmpty()) {
            return false;
        } else {
            boolean success = loginServiceModel.getPassword()
                    .equals(optionalUser.get().getPassword());

            if (success) {
                User loggedIn = optionalUser.get();
                login(loggedIn);
            }
        return success;
        }
    }
    private void login(User user) {
        currentUser.setLoggedIn(true)
                .setEmail(user.getEmail());
    }


    @Override
    public void initializeUsers() {
        User admin = new User();
        admin.setEmail("admin");
        admin.setPassword("admin");

        User pesho = new User();
        admin.setEmail("pesho");
        admin.setPassword("12345");
    }
}
