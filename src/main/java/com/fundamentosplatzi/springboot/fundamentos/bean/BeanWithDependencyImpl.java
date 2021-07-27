package com.fundamentosplatzi.springboot.fundamentos.bean;

public class BeanWithDependencyImpl implements BeanWithDependency, UtilsDependency {
    private MyOperation myOperation;

    public BeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency(){
        int a = 1, b = 2;

        System.out.println(myOperation.sum(a,b));
        System.out.println("Printing from Bean with dependency");
    }

    @Override
    public String getDate(){
        return "No hay citas dentro de 3 dias";
    }
}
