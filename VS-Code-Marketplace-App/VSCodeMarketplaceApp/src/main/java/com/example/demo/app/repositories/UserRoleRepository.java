package com.example.demo.app.repositories;

import com.example.demo.app.models.entityModels.UserRole;
import com.example.demo.app.models.entityModels.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRoleEnum(UserRoleEnum role);
}
