package com.example.demo.app.services;

import com.example.demo.app.models.bindingModels.LoginBindingModel;
import com.example.demo.app.models.serviceModels.LoginServiceModel;

public interface UserService {
    void initializeUsers();
    boolean login(LoginServiceModel loginServiceModel);
}
