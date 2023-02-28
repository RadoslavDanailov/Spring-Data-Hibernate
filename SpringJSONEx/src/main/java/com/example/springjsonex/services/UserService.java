package com.example.springjsonex.services;

import com.example.springjsonex.entities.users.User;
import com.example.springjsonex.entities.users.UserWithSoldProductsDTO;

import java.util.List;

public interface UserService {
    List<UserWithSoldProductsDTO> getUsersWithSoldProducts();

    List<User> getUsersWithSoldProductsOrderByCount();


}
