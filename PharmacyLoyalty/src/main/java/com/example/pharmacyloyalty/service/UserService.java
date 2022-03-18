package com.example.pharmacyloyalty.service;


import com.example.pharmacyloyalty.models.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
