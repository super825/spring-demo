package com.ada.springmvc.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ada.annotation.beans.Department;
import com.ada.annotation.beans.Employee;
import com.ada.annotation.service.IUserService;

@Controller
public class UserHandler {

    @Autowired
    private IUserService userService;

    public UserHandler() {
        System.out.println("======UserHandler被初始化了");
    }

    @RequestMapping("/getEmp")
    public String getEmp(Map<String, Object> map) {
        Department dept = new Department(1, "软件部");
        Employee employee = new Employee(1, "jack", "jack@ada.com", dept);
        map.put("emp", employee);
        userService.getUsers();
        return "model";
    }

}
