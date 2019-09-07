package com.ada.annotation.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ada.annotation.beans.User;
import com.ada.annotation.dao.IUserDao;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    
    public UserDaoImpl() {
        System.out.println("UserDaoImpl被初始化了");
    }

    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户");
    }

    @Override
    public List<User> getUsers() {
        System.out.println("查询用户");
        return null;
    }

}
