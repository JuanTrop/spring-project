package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOperationImplementation implements MyOperation {

    @Override
    public int sum(int a, int b){
        return a + b;
    }
}
