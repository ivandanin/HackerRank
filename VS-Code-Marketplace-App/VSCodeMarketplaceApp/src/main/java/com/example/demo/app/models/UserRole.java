package com.example.demo.app.models;

import com.example.demo.app.models.enums.UserRoleEnum;

//import javax.persistence.*;

//@Entity
//@Table(name = "roles")
public class UserRole {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Enumerated(EnumType.STRING)
    private UserRoleEnum roleEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserRoleEnum getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(UserRoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }
}
