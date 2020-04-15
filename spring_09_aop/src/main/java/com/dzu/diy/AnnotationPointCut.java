package com.dzu.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解的方式实现AOp
@Aspect //标注这个类是一个切面类
public class AnnotationPointCut {

    @Before("execution(* com.dzu.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行之前======");
    }


    @After("execution(* com.dzu.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行之后======");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.dzu.service.UserServiceImpl.*(..))")
    public void around(){

    }
}
