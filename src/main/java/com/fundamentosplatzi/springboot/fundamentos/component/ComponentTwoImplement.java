package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements  ComponentDependency{
    public void greet(){
        System.out.println("Hello world from component n2");
    }
}
