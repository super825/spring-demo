package com.ada.annotation.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ada.annotation.service.IUserService;

public class SpringAnnotationTest {

    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans-annotation.xml");
        IUserService userService = (IUserService) ioc.getBean("userService");
        userService.addUser();
    }
}
