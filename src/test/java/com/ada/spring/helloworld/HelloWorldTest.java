package com.ada.spring.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void test() {
        // 1.创建IOC容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从IOC容器中获取HelloWorld对象
        HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
        // 3.调用HelloWorld中的sayHello方法
        helloWorld.sayHello();
    }

}
