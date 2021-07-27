package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;
import org.springframework.util.SocketUtils;

@Component
public class ComponentImplement implements ComponentDependency{

    public ComponentImplement() {
    }

    @Override
    public void  greet(){
        System.out.println("Hello world");
    }
}
