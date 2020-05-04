package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Lab55 {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(IBMConfig.class);
        TestService ts = (TestService)ctx.getBean("ts");
        ts.showMySQLInfo();
        System.out.println("done");

    }
}
