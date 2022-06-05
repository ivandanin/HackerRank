package com.example.demo.app.repositories;

import com.example.demo.app.models.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByEmail(String email);
}
