package com.example.demo.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    private Integer userId;
    private String userName;
    private String password;

    public UserDto() {
    }

    public UserDto(Integer userId, String userName, String password) {
        this.setUserId(userId);
        this.setUserName(userName);
        this.setPassword(password);
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
