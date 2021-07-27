package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.BeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private BeanWithDependency beanWD;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,
	BeanWithDependency beanWD){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.beanWD = beanWD;

	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args){
		componentDependency.greet();
		myBean.print();
		beanWD.printWithDependency();
	}

}
