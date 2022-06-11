package com.example.demo.app.services.impl;

import com.example.demo.app.CurrentUser;
import com.example.demo.app.models.entityModels.User;
import com.example.demo.app.models.entityModels.UserRole;
import com.example.demo.app.models.entityModels.enums.UserRoleEnum;
import com.example.demo.app.models.serviceModels.LoginServiceModel;
import com.example.demo.app.repositories.UserRepository;
import com.example.demo.app.repositories.UserRoleRepository;
import com.example.demo.app.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final CurrentUser currentUser;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository, CurrentUser currentUser, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.currentUser = currentUser;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean login(LoginServiceModel loginServiceModel) {

        Optional<User> optionalUser = userRepository.findByEmail(loginServiceModel.getEmail());

        if (optionalUser.isEmpty()) {
            logout();
            return false;
        } else {
            boolean success = loginServiceModel.getPassword()
                    .equals(optionalUser.get().getPassword());

            if (success) {
                User loggedIn = optionalUser.get();
                login(loggedIn);

                loggedIn.getRoles()
                        .forEach(r -> currentUser.addRole(r.getRoleEnum()));
            }
        return success;
        }
    }

    @Override
    public void logout() {
        currentUser.clean();

    }

    private void login(User user) {
        currentUser.setLoggedIn(true)
                .setEmail(user.getEmail());
    }

    @Override
    public boolean isEmailUsed(String email) {
        return userRepository.findByEmail(email)
                .isEmpty();
    }

    @Override
    public void initializeUsersAndRoles() {
        initializeRoles();
        initializeUsers();
    }

    @Override
    public void initializeUsers() {

        if (userRepository.count() == 0) {
            UserRole adminRole = userRoleRepository.findByRoleEnum(UserRoleEnum.ADMIN);
            UserRole userRole = userRoleRepository.findByRoleEnum(UserRoleEnum.USER);

            User admin = new User();

            admin.setEmail("admin@abv.bg");
            admin.setPassword(passwordEncoder.encode("admin"));
            admin.setRoles(Set.of(adminRole, userRole));
            userRepository.save(admin);

            User pesho = new User();
            pesho.setEmail("pesho@abv.bg");
            pesho.setPassword(passwordEncoder.encode("12345"));
            pesho.setRoles(Set.of(userRole));
            userRepository.save(pesho);
        }
    }

    @Override
    public void initializeRoles() {
        if (userRoleRepository.count() == 0) {
            UserRole adminRole = new UserRole();
            adminRole.setRoleEnum(UserRoleEnum.ADMIN);

            UserRole userRole = new UserRole();
            userRole.setRoleEnum(UserRoleEnum.USER);

            userRoleRepository.saveAll(List.of(adminRole, userRole));
        }
    }
}
