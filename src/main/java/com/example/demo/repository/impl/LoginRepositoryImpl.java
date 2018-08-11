package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.LoginRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {
    @Override
    public boolean userLogin(User user) {
        return false;
    }
}
