package com.example.demo.app.repositories;

import com.example.demo.app.models.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
