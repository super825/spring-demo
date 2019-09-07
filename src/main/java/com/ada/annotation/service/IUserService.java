package com.ada.annotation.service;

import java.util.List;

import com.ada.annotation.beans.User;

public interface IUserService {
    void addUser();

    void deleteUser();

    void updateUser();

    List<User> getUsers();
}
