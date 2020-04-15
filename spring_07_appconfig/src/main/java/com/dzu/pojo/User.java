package com.dzu.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//这个注解的意思，就是说明这个类被spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("zd")//属性注入值
    public void setName(String name) {
        this.name = name;
    }
}
