package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplementation2 implements MyBean {
    @Override
    public void print(){
        System.out.println("Second own implementation of the method");
    }
}
