package com.example.springautomappingobjects.Services;

import com.example.springautomappingobjects.entities.users.LoginDTO;
import com.example.springautomappingobjects.entities.users.RegisterDTO;
import com.example.springautomappingobjects.entities.users.User;

import java.util.Optional;

public interface UserService {
    User register(RegisterDTO registerData);

    Optional<User> login(LoginDTO loginData);

    User getLoggedUser();

    void logout();
}
