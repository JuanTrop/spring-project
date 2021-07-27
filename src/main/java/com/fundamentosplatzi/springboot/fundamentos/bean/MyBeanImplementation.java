package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplementation implements MyBean{
    @Override
    public void print(){
        System.out.println("Own implementation of the method");
    }
}
