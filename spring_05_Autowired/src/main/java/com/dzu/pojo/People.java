package com.dzu.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {
    private  String name;
    @Autowired
    private  Cat cat;
    @Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }
}
