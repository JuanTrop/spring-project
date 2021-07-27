package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplementation2();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplementation();
    }

    @Bean
    public BeanWithDependency beanOperationWithDependency(MyOperation myOperation){
        return new BeanWithDependencyImpl(myOperation);
    }

}
