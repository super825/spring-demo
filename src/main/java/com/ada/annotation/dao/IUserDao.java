package com.ada.annotation.dao;

import java.util.List;

import com.ada.annotation.beans.User;

public interface IUserDao {
    void addUser();

    void deleteUser();

    void updateUser();

    List<User> getUsers();
}
