package com.fundamentosplatzi.springboot.fundamentos.bean;

import java.util.Date;

public class MyOperationImplementation implements MyOperation, UtilsDependency {

    @Override
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public String getDate(){
        Date now  = java.util.Calendar.getInstance().getTime();
        return now.toString();
    }
}
