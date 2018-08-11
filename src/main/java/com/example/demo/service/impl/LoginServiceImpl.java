package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean login(UserDto userDto) {
        return false;
    }
}
