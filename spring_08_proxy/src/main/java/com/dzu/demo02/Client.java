package com.dzu.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceProxy proxy = context.getBean("userServiceProxy", UserServiceProxy.class);
        proxy.add();
    }
}
