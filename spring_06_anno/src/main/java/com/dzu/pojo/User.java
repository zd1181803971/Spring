package com.dzu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {

//    @Value("zd")  在属性上也可以
    public String name;
    //相当于 <property name="name" value="zd"/>
    @Value("zd")
    public void setName(String name) {
        this.name = name;
    }
}
