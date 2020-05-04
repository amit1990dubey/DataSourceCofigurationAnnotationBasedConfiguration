package com.ibm.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class IBMConfig {

   @Bean

    public DataSource mysqlDS()
   {
       DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setDriverClassName("com.mysql.jdbc.Driver");
       ds.setUrl("jdbc:mysql://localhost/ibmdb");
       ds.setUsername("root");
       ds.setPassword("amit");
       return ds;

   }

   @Bean(name="ts")

    public TestService testService()
   {
       return new TestService();
   }
}
