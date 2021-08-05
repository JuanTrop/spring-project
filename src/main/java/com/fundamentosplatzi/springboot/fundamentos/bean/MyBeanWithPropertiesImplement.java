package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties{
    String name, surname;

    public MyBeanWithPropertiesImplement(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String function(){
        return name + " -  " + surname;
    }
}
