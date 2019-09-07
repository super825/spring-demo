package com.ada.annotation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ada.annotation.beans.User;
import com.ada.annotation.dao.IUserDao;
import com.ada.annotation.service.IUserService;

import jdk.nashorn.internal.ir.annotations.Reference;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Qualifier("userDao2")
    @Autowired
    private IUserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl被初始了");
    }

    @Override
    public void addUser() {
        userDao.addUser();
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }

    @Override
    public void updateUser() {
        userDao.updateUser();
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

}
