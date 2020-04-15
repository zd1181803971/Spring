package com.dzu.demo04;

import com.dzu.demo02.UserService;
import com.dzu.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();

        ProxyInvocationHandler pih=new ProxyInvocationHandler();

        pih.setTarget(service);

        UserService proxy = (UserService) pih.getProxy();
        proxy.query();
    }
}
